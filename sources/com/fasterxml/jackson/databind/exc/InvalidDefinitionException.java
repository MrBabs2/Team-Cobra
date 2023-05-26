package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public class InvalidDefinitionException extends JsonMappingException {
    protected InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        return new InvalidDefinitionException(jsonParser, str, beanDescription, beanPropertyDefinition);
    }

    protected InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    protected InvalidDefinitionException(JsonParser jsonParser, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        super(jsonParser, str);
        if (beanDescription != null) {
            beanDescription.getType();
        }
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        return new InvalidDefinitionException(jsonGenerator, str, beanDescription, beanPropertyDefinition);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }

    protected InvalidDefinitionException(JsonGenerator jsonGenerator, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        super(jsonGenerator, str);
        if (beanDescription != null) {
            beanDescription.getType();
        }
    }
}
