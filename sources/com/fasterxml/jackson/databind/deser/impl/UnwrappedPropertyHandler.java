package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnwrappedPropertyHandler {
    protected final List<SettableBeanProperty> _properties;

    public UnwrappedPropertyHandler() {
        this._properties = new ArrayList();
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        this._properties.add(settableBeanProperty);
    }

    public Object processUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        int size = this._properties.size();
        for (int i = 0; i < size; i++) {
            JsonParser asParser = tokenBuffer.asParser();
            asParser.nextToken();
            this._properties.get(i).deserializeAndSet(asParser, deserializationContext, obj);
        }
        return obj;
    }

    public UnwrappedPropertyHandler renameAll(NameTransformer nameTransformer) {
        JsonDeserializer<Object> unwrappingDeserializer;
        ArrayList arrayList = new ArrayList(this._properties.size());
        for (SettableBeanProperty next : this._properties) {
            SettableBeanProperty withSimpleName = next.withSimpleName(nameTransformer.transform(next.getName()));
            JsonDeserializer<Object> valueDeserializer = withSimpleName.getValueDeserializer();
            if (!(valueDeserializer == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer)) {
                withSimpleName = withSimpleName.withValueDeserializer(unwrappingDeserializer);
            }
            arrayList.add(withSimpleName);
        }
        return new UnwrappedPropertyHandler(arrayList);
    }

    protected UnwrappedPropertyHandler(List<SettableBeanProperty> list) {
        this._properties = list;
    }
}
