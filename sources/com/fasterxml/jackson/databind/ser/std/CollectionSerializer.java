package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    public CollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super((Class<?>) Collection.class, javaType, z, typeSerializer, jsonSerializer);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new CollectionSerializer(this, this._property, typeSerializer, this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e) {
                        wrapAndThrow(serializerProvider, (Throwable) e, (Object) collection, i);
                        throw null;
                    }
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
                i++;
            } while (it.hasNext());
        }
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super((AsArraySerializerBase<?>) collectionSerializer, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Collection<?> collection) {
        return collection.isEmpty();
    }

    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = collection.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            serializeContents(collection, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(collection, jsonGenerator, serializerProvider);
    }

    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializer;
        jsonGenerator.setCurrentValue(collection);
        JsonSerializer<Object> jsonSerializer2 = this._elementSerializer;
        if (jsonSerializer2 != null) {
            serializeContentsUsing(collection, jsonGenerator, serializerProvider, jsonSerializer2);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i = 0;
            do {
                try {
                    Object next = it.next();
                    if (next == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class<?> cls = next.getClass();
                        JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                        if (serializerFor == null) {
                            if (this._elementType.hasGenericTypes()) {
                                jsonSerializer = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider);
                            } else {
                                jsonSerializer = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                            }
                            serializerFor = jsonSerializer;
                            propertySerializerMap = this._dynamicSerializers;
                        }
                        if (typeSerializer == null) {
                            serializerFor.serialize(next, jsonGenerator, serializerProvider);
                        } else {
                            serializerFor.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                        }
                    }
                    i++;
                } catch (Exception e) {
                    wrapAndThrow(serializerProvider, (Throwable) e, (Object) collection, i);
                    throw null;
                }
            } while (it.hasNext());
        }
    }

    public CollectionSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }
}
