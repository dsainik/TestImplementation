package com.java.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = Meals.class)
public @interface Meal {

    int id();
    String synopsis() default "unassigned";
    String engineer();
    String  date() default "unknown";
    
}
