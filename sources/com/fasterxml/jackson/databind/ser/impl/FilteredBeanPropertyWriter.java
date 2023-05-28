package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;

public abstract class FilteredBeanPropertyWriter {

    private static final class MultiView extends BeanPropertyWriter implements Serializable {
        protected final BeanPropertyWriter _delegate;
        protected final Class<?>[] _views;

        protected MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._views = clsArr;
        }

        private final boolean _inView(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            for (Class<?> isAssignableFrom : this._views) {
                if (isAssignableFrom.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignNullSerializer(jsonSerializer);
        }

        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignSerializer(jsonSerializer);
        }

        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            if (_inView(serializerProvider.getActiveView())) {
                this._delegate.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            if (_inView(serializerProvider.getActiveView())) {
                this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }

        public MultiView rename(NameTransformer nameTransformer) {
            return new MultiView(this._delegate.rename(nameTransformer), this._views);
        }
    }

    private static final class SingleView extends BeanPropertyWriter implements Serializable {
        protected final BeanPropertyWriter _delegate;
        protected final Class<?> _view;

        protected SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._view = cls;
        }

        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignNullSerializer(jsonSerializer);
        }

        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignSerializer(jsonSerializer);
        }

        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }

        public SingleView rename(NameTransformer nameTransformer) {
            return new SingleView(this._delegate.rename(nameTransformer), this._view);
        }
    }

    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new SingleView(beanPropertyWriter, clsArr[0]);
        }
        return new MultiView(beanPropertyWriter, clsArr);
    }
}
