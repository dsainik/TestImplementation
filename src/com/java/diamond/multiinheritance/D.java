package com.java.diamond.multiinheritance;

interface Interface1 {
    default public void foo() { System.out.println("Interface1's foo"); }
}
interface Interface2 {
    default public void foo() { System.out.println("Interface2's foo"); }
}
public class Diamond implements Interface1, Interface2 {
    public static void main(String []args) {
        new Diamond().foo();
    }
}