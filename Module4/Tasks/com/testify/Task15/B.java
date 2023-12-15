package com.testify.Task15;

public class B extends A {
    public static void main(String[] args) {
        B childClass = new B();
        A parentClass = new A();
        parentClass.breakfast();
        parentClass.lunch();
        parentClass.dinner();
        childClass.male();
        childClass.female();

    }

    public void male (){
        System.out.println("Paul is a boy's name");
    }

    public void female (){
        System.out.println("Paulina is a girl's name");
    }
}
