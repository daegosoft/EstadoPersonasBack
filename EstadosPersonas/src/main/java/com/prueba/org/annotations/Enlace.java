package com.prueba.org.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Enlace {
    String name();    
    boolean required() default false;
    Class<?> type() default Object.class;
    Class<?> returnType() default Object.class;
    String conversion() default "SIMPLE";
}
