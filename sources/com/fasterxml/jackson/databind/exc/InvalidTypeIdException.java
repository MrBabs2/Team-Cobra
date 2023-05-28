package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

public class InvalidTypeIdException extends MismatchedInputException {
    public InvalidTypeIdException(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        super(jsonParser, str);
    }

    public static InvalidTypeIdException from(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        return new InvalidTypeIdException(jsonParser, str, javaType, str2);
    }
}
