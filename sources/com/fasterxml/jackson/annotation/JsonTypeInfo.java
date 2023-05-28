package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonTypeInfo {

    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$As */
    public enum C4731As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$Id */
    public enum C4732Id {
        NONE((String) null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        CUSTOM((String) null);
        
        private final String _defaultPropertyName;

        private C4732Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    @Deprecated
    public static abstract class None {
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    C4731As include() default C4731As.PROPERTY;

    String property() default "";

    C4732Id use();

    boolean visible() default false;
}
