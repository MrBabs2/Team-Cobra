package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class ReferenceType extends SimpleType {
    protected final JavaType _anchorType;
    protected final JavaType _referencedType;

    /* JADX WARNING: type inference failed for: r16v0, types: [com.fasterxml.jackson.databind.JavaType] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected ReferenceType(java.lang.Class<?> r11, com.fasterxml.jackson.databind.type.TypeBindings r12, com.fasterxml.jackson.databind.JavaType r13, com.fasterxml.jackson.databind.JavaType[] r14, com.fasterxml.jackson.databind.JavaType r15, com.fasterxml.jackson.databind.JavaType r16, java.lang.Object r17, java.lang.Object r18, boolean r19) {
        /*
            r10 = this;
            r9 = r10
            int r5 = r15.hashCode()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r17
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r15
            r9._referencedType = r0
            if (r16 != 0) goto L_0x001a
            r0 = r9
            goto L_0x001c
        L_0x001a:
            r0 = r16
        L_0x001c:
            r9._anchorType = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.ReferenceType.<init>(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType[], com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType, java.lang.Object, java.lang.Object, boolean):void");
    }

    public static ReferenceType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new ReferenceType(cls, typeBindings, javaType, javaTypeArr, javaType2, (JavaType) null, (Object) null, (Object) null, false);
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        return this._class.getName() + '<' + this._referencedType.toCanonical();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ReferenceType.class) {
            return false;
        }
        ReferenceType referenceType = (ReferenceType) obj;
        if (referenceType._class != this._class) {
            return false;
        }
        return this._referencedType.equals(referenceType._referencedType);
    }

    public JavaType getContentType() {
        return this._referencedType;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        sb.append('<');
        StringBuilder genericSignature = this._referencedType.getGenericSignature(sb);
        genericSignature.append(">;");
        return genericSignature;
    }

    public boolean hasContentType() {
        return true;
    }

    public boolean isReferenceType() {
        return true;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new ReferenceType(cls, this._bindings, javaType, javaTypeArr, this._referencedType, this._anchorType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(buildCanonicalName());
        sb.append('<');
        sb.append(this._referencedType);
        sb.append('>');
        sb.append(']');
        return sb.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._referencedType == javaType) {
            return this;
        }
        return new ReferenceType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._anchorType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public JavaType getReferencedType() {
        return this._referencedType;
    }

    public ReferenceType withContentTypeHandler(Object obj) {
        if (obj == this._referencedType.getTypeHandler()) {
            return this;
        }
        return new ReferenceType(this._class, this._bindings, this._superClass, this._superInterfaces, this._referencedType.withTypeHandler(obj), this._anchorType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public ReferenceType withContentValueHandler(Object obj) {
        if (obj == this._referencedType.getValueHandler()) {
            return this;
        }
        return new ReferenceType(this._class, this._bindings, this._superClass, this._superInterfaces, this._referencedType.withValueHandler(obj), this._anchorType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public ReferenceType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new ReferenceType(this._class, this._bindings, this._superClass, this._superInterfaces, this._referencedType.withStaticTyping(), this._anchorType, this._valueHandler, this._typeHandler, true);
    }

    public ReferenceType withTypeHandler(Object obj) {
        if (obj == this._typeHandler) {
            return this;
        }
        return new ReferenceType(this._class, this._bindings, this._superClass, this._superInterfaces, this._referencedType, this._anchorType, this._valueHandler, obj, this._asStatic);
    }

    public ReferenceType withValueHandler(Object obj) {
        if (obj == this._valueHandler) {
            return this;
        }
        return new ReferenceType(this._class, this._bindings, this._superClass, this._superInterfaces, this._referencedType, this._anchorType, obj, this._typeHandler, this._asStatic);
    }
}
