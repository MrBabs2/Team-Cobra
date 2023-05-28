package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

public class MapLikeType extends TypeBase {
    protected final JavaType _keyType;
    protected final JavaType _valueType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected MapLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode() ^ javaType3.hashCode(), obj, obj2, z);
        this._keyType = javaType2;
        this._valueType = javaType3;
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this._keyType != null) {
            sb.append('<');
            sb.append(this._keyType.toCanonical());
            sb.append(',');
            sb.append(this._valueType.toCanonical());
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
        MapLikeType mapLikeType = (MapLikeType) obj;
        if (this._class != mapLikeType._class || !this._keyType.equals(mapLikeType._keyType) || !this._valueType.equals(mapLikeType._valueType)) {
            return false;
        }
        return true;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        sb.append('<');
        this._keyType.getGenericSignature(sb);
        this._valueType.getGenericSignature(sb);
        sb.append(">;");
        return sb;
    }

    public JavaType getKeyType() {
        return this._keyType;
    }

    public boolean hasHandlers() {
        return super.hasHandlers() || this._valueType.hasHandlers() || this._keyType.hasHandlers();
    }

    public boolean isContainerType() {
        return true;
    }

    public boolean isMapLikeType() {
        return true;
    }

    public boolean isTrueMapType() {
        return Map.class.isAssignableFrom(this._class);
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, typeBindings, javaType, javaTypeArr, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", new Object[]{this._class.getName(), this._keyType, this._valueType});
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._valueType == javaType) {
            return this;
        }
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r4 = r3._valueType.withHandlersFrom(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType withHandlersFrom(com.fasterxml.jackson.databind.JavaType r4) {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.JavaType r0 = super.withHandlersFrom(r4)
            com.fasterxml.jackson.databind.JavaType r1 = r4.getKeyType()
            boolean r2 = r0 instanceof com.fasterxml.jackson.databind.type.MapLikeType
            if (r2 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            com.fasterxml.jackson.databind.JavaType r2 = r3._keyType
            com.fasterxml.jackson.databind.JavaType r1 = r2.withHandlersFrom(r1)
            com.fasterxml.jackson.databind.JavaType r2 = r3._keyType
            if (r1 == r2) goto L_0x001e
            com.fasterxml.jackson.databind.type.MapLikeType r0 = (com.fasterxml.jackson.databind.type.MapLikeType) r0
            com.fasterxml.jackson.databind.type.MapLikeType r0 = r0.withKeyType(r1)
        L_0x001e:
            com.fasterxml.jackson.databind.JavaType r4 = r4.getContentType()
            if (r4 == 0) goto L_0x0032
            com.fasterxml.jackson.databind.JavaType r1 = r3._valueType
            com.fasterxml.jackson.databind.JavaType r4 = r1.withHandlersFrom(r4)
            com.fasterxml.jackson.databind.JavaType r1 = r3._valueType
            if (r4 == r1) goto L_0x0032
            com.fasterxml.jackson.databind.JavaType r0 = r0.withContentType(r4)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.MapLikeType.withHandlersFrom(com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    public MapLikeType withKeyType(JavaType javaType) {
        if (javaType == this._keyType) {
            return this;
        }
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withKeyValueHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withContentTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withContentValueHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    public MapLikeType withTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
    }

    public MapLikeType withValueHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
    }
}
