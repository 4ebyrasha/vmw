/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.tileentity.TileEntity
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.MethodVisitor
 *  org.objectweb.asm.Opcodes
 */
package com.vicmatskiv.weaponlib.tile;

import com.vicmatskiv.weaponlib.tile.CustomTileEntityConfiguration;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.tileentity.TileEntity;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class CustomTileEntityClassFactory
implements Opcodes {
    private static CustomTileEntityClassFactory instance = new CustomTileEntityClassFactory();
    private Map<Class<?>, CustomTileEntityConfiguration<?>> entityConfigurations = new HashMap();

    public static CustomTileEntityClassFactory getInstance() {
        return instance;
    }

    public <T extends TileEntity> Class<? extends T> generateEntitySubclass(Class<T> baseEntityClass, int entityId, CustomTileEntityConfiguration<?> configuration) {
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

    public CustomTileEntityConfiguration<?> getConfiguration(Class<?> entityClass) {
        return this.entityConfigurations.get(entityClass);
    }

    private byte[] generateClassBytecode(String className, Class<?> baseEntityClass) {
        ClassWriter cw = new ClassWriter(0);
        String baseClassResourceName = baseEntityClass.getName().replace('.', '/');
        String classResourceName = className.replace('.', '/');
        cw.visit(52, 33, classResourceName, null, baseClassResourceName, null);
        MethodVisitor mv = cw.visitMethod(1, "<init>", "()V", null, null);
        mv.visitCode();
        Label l0 = new Label();
        mv.visitLabel(l0);
        mv.visitLineNumber(5, l0);
        mv.visitVarInsn(25, 0);
        mv.visitMethodInsn(183, baseClassResourceName, "<init>", "()V", false);
        mv.visitInsn(177);
        Label l1 = new Label();
        mv.visitLabel(l1);
        mv.visitLocalVariable("this", "L" + classResourceName + ";", null, l0, l1, 0);
        mv.visitMaxs(1, 1);
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

