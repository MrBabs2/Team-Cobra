package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleType extends TypeBase {
    protected SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), (JavaType) null, (JavaType[]) null);
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, (TypeBindings) null, (JavaType) null, (JavaType[]) null, (Object) null, (Object) null, false);
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0) {
            sb.append('<');
            for (int i = 0; i < size; i++) {
                JavaType containedType = containedType(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(containedType.toCanonical());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb.append('<');
            for (int i = 0; i < size; i++) {
                sb = containedType(i).getGenericSignature(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    public boolean hasContentType() {
        return false;
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(buildCanonicalName());
        sb.append(']');
        return sb.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, (Object) null, (Object) null, false);
    }

    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    public SimpleType withTypeHandler(Object obj) {
        if (this._typeHandler == obj) {
            return this;
        }
        return new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    public SimpleType withValueHandler(Object obj) {
        if (obj == this._valueHandler) {
            return this;
        }
        return new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z);
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, i, obj, obj2, z);
    }
}
