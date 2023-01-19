package com.driver;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        b.meth();
    }
  
}
class A{
    String meth() {
        return null;
    }
}
class B extends A{
    String meth(){
        return null;
    }

}