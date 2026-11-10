/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.MethodVisitor
 *  org.objectweb.asm.Opcodes
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.Entity;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class EntityClassFactory
implements Opcodes {
    private static EntityClassFactory instance = new EntityClassFactory();
    private Map<Class<?>, EntityConfiguration> entityConfigurations = new HashMap();

    public static EntityClassFactory getInstance() {
        return instance;
    }

    public <T extends Entity> Class<? extends T> generateEntitySubclass(Class<T> baseEntityClass, int entityId, EntityConfiguration configuration) {
        Class<?> generatedClass;
        String generatedClassName = baseEntityClass.getName() + entityId;
        try {
            generatedClass = new EntityClassLoader(generatedClassName, this.generateClassBytecode(generatedClassName, baseEntityClass), baseEntityClass.getClassLoader()).loadClass(generatedClassName);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.entityConfigurations.put(generatedClass, configuration);
        return generatedClass;
    }

    public EntityConfiguration getConfiguration(Class<?> entityClass) {
        return this.entityConfigurations.get(entityClass);
    }

    private byte[] generateClassBytecode(String className, Class<?> baseEntityClass) {
        ClassWriter cw = new ClassWriter(0);
        String baseClassResourceName = baseEntityClass.getName().replace('.', '/');
        String classResourceName = className.replace('.', '/');
        cw.visit(52, 33, classResourceName, null, baseClassResourceName, null);
        MethodVisitor mv = cw.visitMethod(1, "<init>", "(Lnet/minecraft/world/World;)V", null, null);
        mv.visitCode();
        Label l0 = new Label();
        mv.visitLabel(l0);
        mv.visitLineNumber(8, l0);
        mv.visitVarInsn(25, 0);
        mv.visitVarInsn(25, 1);
        mv.visitMethodInsn(183, baseClassResourceName, "<init>", "(Lnet/minecraft/world/World;)V", false);
        Label l1 = new Label();
        mv.visitLabel(l1);
        mv.visitLineNumber(9, l1);
        mv.visitInsn(177);
        Label l2 = new Label();
        mv.visitLabel(l2);
        mv.visitLocalVariable("this", "L" + classResourceName + ";", null, l0, l2, 0);
        mv.visitLocalVariable("worldIn", "Lnet/minecraft/world/World;", null, l0, l2, 1);
        mv.visitMaxs(2, 2);
        mv.visitEnd();
        cw.visitEnd();
        return cw.toByteArray();
    }

    private static class EntityClassLoader
    extends ClassLoader {
        private byte[] rawClassBytes;
        private String className;

        public EntityClassLoader(String className, byte[] classBytes, ClassLoader parentClassLoader) {
            super(parentClassLoader);
            this.className = className;
            this.rawClassBytes = classBytes;
        }

        @Override
        public Class<?> findClass(String name) throws ClassNotFoundException {
            if (!this.className.equals(name)) {
                throw new ClassNotFoundException(name);
            }
            return this.defineClass(name, this.rawClassBytes, 0, this.rawClassBytes.length);
        }
    }
}

