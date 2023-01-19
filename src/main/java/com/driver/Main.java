package com.driver;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.meth();
        b.meth();
    }

    public static class A{
        String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        String meth(){
            return "Method is overridden in Extendend class B";
        }

    }
  
}

