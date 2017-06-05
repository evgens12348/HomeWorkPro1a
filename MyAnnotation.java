package com.gmail.s12348.evgen;

import java.lang.annotation.*;


@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int param1 ();
    int param2 ();
}
