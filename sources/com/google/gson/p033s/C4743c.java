package com.google.gson.p033s;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.s.c */
/* compiled from: SerializedName */
public @interface C4743c {
    String[] alternate() default {};

    String value();
}
