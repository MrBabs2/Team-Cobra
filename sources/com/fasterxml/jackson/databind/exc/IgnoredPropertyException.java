package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

public class IgnoredPropertyException extends PropertyBindingException {
    public IgnoredPropertyException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation, cls, str2, collection);
    }

    public static IgnoredPropertyException from(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Class<?> cls2 = cls;
        JsonParser jsonParser2 = jsonParser;
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser2, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", new Object[]{str, cls2.getName()}), jsonParser.getCurrentLocation(), cls2, str, collection);
        ignoredPropertyException.prependPath(obj, str);
        return ignoredPropertyException;
    }
}
