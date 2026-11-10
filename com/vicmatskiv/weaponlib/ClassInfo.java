/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib;

import java.util.HashMap;
import java.util.Map;

public class ClassInfo {
    private String notchClassName;
    private String mcpClassName;
    private Map<MethodSignature, String> notchMethodInfoMap = new HashMap<MethodSignature, String>();
    private Map<MethodSignature, String> notchSignatureMap = new HashMap<MethodSignature, String>();
    private Map<MethodSignature, String> mcpMethodInfoMap = new HashMap<MethodSignature, String>();
    private Map<String, String> notchFieldNameMap = new HashMap<String, String>();
    private Map<String, String> notchFieldTypeMap = new HashMap<String, String>();

    public ClassInfo(String mcpClassName, String notchClassName) {
        this.mcpClassName = mcpClassName;
        this.notchClassName = notchClassName;
    }

    public ClassInfo addFieldInfo(String mcpFieldName, String fieldType, String notchFieldName, String notchFieldType) {
        this.notchFieldNameMap.put(mcpFieldName, notchFieldName);
        this.notchFieldTypeMap.put(mcpFieldName, notchFieldType);
        return this;
    }

    public ClassInfo addMethodInfo(String mcpMethodName, String signature, String notchName) {
        this.notchMethodInfoMap.put(new MethodSignature(mcpMethodName, signature), notchName);
        return this;
    }

    public ClassInfo addMethodInfo2(String mcpMethodName, String signature, String notchName, String notchSignature) {
        this.notchMethodInfoMap.put(new MethodSignature(mcpMethodName, signature), notchName);
        this.notchSignatureMap.put(new MethodSignature(mcpMethodName, signature), notchSignature);
        return this;
    }

    public ClassInfo addMethodInfo(String genericMethodName, String mcpMethodName, String signature, String notchName) {
        this.mcpMethodInfoMap.put(new MethodSignature(genericMethodName, signature), mcpMethodName);
        this.notchMethodInfoMap.put(new MethodSignature(genericMethodName, signature), notchName);
        return this;
    }

    public boolean classMatches(String className) {
        String normalizedClassName = className.replace('.', '/');
        return this.mcpClassName.equals(normalizedClassName) || this.notchClassName.equals(normalizedClassName);
    }

    public boolean methodMatches(String expectedMcpMethodName, String expectedMcpMethodSignature, String methodOwnerClassName, String methodName, String methodSignature) {
        if (!expectedMcpMethodSignature.equals(methodSignature) && !methodSignature.equals(this.notchSignatureMap.get(new MethodSignature(expectedMcpMethodName, expectedMcpMethodSignature)))) {
            return false;
        }
        if (this.mcpClassName.equals(methodOwnerClassName)) {
            return expectedMcpMethodName.equals(methodName) || methodName.equals(this.mcpMethodInfoMap.get(new MethodSignature(expectedMcpMethodName, expectedMcpMethodSignature)));
        }
        if (!this.notchClassName.equals(methodOwnerClassName)) {
            return false;
        }
        String notchMethodName = this.notchMethodInfoMap.get(new MethodSignature(expectedMcpMethodName, expectedMcpMethodSignature));
        return notchMethodName != null && methodName.equals(notchMethodName);
    }

    public String getNotchClassName() {
        return this.notchClassName;
    }

    public String getMcpClassName() {
        return this.mcpClassName;
    }

    public String getNotchMethodName(String mcpMethodName, String signature) {
        return this.notchMethodInfoMap.get(new MethodSignature(mcpMethodName, signature));
    }

    public String getNotchFieldName(String mcpFieldName) {
        return this.notchFieldNameMap.get(mcpFieldName);
    }

    public String getNotchFieldType(String mcpFieldName) {
        return this.notchFieldTypeMap.get(mcpFieldName);
    }

    private static class MethodSignature {
        String name;
        String signature;

        MethodSignature(String name, String signature) {
            this.name = name;
            this.signature = signature;
        }

        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + (this.signature == null ? 0 : this.signature.hashCode());
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            MethodSignature other = (MethodSignature)obj;
            if (this.name == null ? other.name != null : !this.name.equals(other.name)) {
                return false;
            }
            return !(this.signature == null ? other.signature != null : !this.signature.equals(other.signature));
        }
    }
}

