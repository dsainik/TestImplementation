package com.java.annotations;

public @interface Unique {
    
    enum Type {A,B}
    
    Type name();
}
