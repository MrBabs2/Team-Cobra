package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Collection;

public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements ContextualSerializer {
    protected final Boolean _unwrapSingle;

    protected StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    public abstract JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            if (r7 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.getAnnotationIntrospector()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.getMember()
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r2.findContentSerializer(r3)
            if (r2 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.serializerInstance(r3, r2)
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.Class r3 = r5.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.findFormatOverrides(r6, r7, r3)
            if (r3 == 0) goto L_0x002c
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r3 = r3.getFeature(r4)
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r5.findContextualConvertingSerializer(r6, r7, r2)
            if (r2 != 0) goto L_0x0037
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.findValueSerializer((java.lang.Class<?>) r0, (com.fasterxml.jackson.databind.BeanProperty) r7)
        L_0x0037:
            boolean r4 = r5.isDefaultSerializer(r2)
            if (r4 == 0) goto L_0x0047
            java.lang.Boolean r6 = r5._unwrapSingle
            if (r3 != r6) goto L_0x0042
            return r5
        L_0x0042:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r5._withResolved(r7, r3)
            return r6
        L_0x0047:
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r7 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            com.fasterxml.jackson.databind.JavaType r6 = r6.constructType(r0)
            r0 = 1
            r7.<init>(r6, r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return t == null || t.size() == 0;
    }

    protected StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super((StdSerializer<?>) staticListSerializerBase);
        this._unwrapSingle = bool;
    }
}
