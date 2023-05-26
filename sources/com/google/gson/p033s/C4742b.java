package com.google.gson.p033s;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.s.b */
/* compiled from: JsonAdapter */
public @interface C4742b {
    boolean nullSafe() default true;

    Class<?> value();
}
