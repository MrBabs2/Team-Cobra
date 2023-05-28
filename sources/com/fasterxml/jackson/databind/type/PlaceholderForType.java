package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class PlaceholderForType extends TypeBase {
    protected JavaType _actualType;
    protected final int _ordinal;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), (JavaType[]) null, 1, (Object) null, (Object) null, false);
        this._ordinal = i;
    }

    private <T> T _unsupported() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + PlaceholderForType.class.getName());
    }

    public JavaType actualType() {
        return this._actualType;
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        return toString();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append('$');
        sb.append(this._ordinal + 1);
        return sb;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        getErasedSignature(sb);
        return sb;
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        _unsupported();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        getErasedSignature(sb);
        return sb.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        _unsupported();
        throw null;
    }

    public JavaType withContentTypeHandler(Object obj) {
        _unsupported();
        throw null;
    }

    public JavaType withContentValueHandler(Object obj) {
        _unsupported();
        throw null;
    }

    public JavaType withStaticTyping() {
        _unsupported();
        throw null;
    }

    public JavaType withTypeHandler(Object obj) {
        _unsupported();
        throw null;
    }

    public JavaType withValueHandler(Object obj) {
        _unsupported();
        throw null;
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }
}
