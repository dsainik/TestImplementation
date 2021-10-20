package com.java.annotations;

import com.java.annotations.Unique.Type;

public class MyClassAnnotation {

    @Meal(engineer = "Sainik", id = 1 , date="20170809" )
    @Meal(engineer = "Sainik1", id = 2 , date="20170809" )
    @Meal(engineer = "Sainik2", id = 3 , date="20170809" )
    @Meal(engineer = "Sainik3", id = 4 , date="20170809" )
    private Person person;
    
    
    class Person{
        
        @Unique(name=Type.A)
        String name;
        
    }
    
}
