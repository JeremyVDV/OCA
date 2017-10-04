package Exceptions;

import java.io.IOException;

// Voorbeeld 1
class A{
    protected void m() throws IOException{}
}
class B extends A{
    public void m(){}
}

class TestClass{
    public static void main(String[] args){
        A a = new B();
        //Throws exception, want checked exception.
        // Oplossing? methode throws Exception
        //a.m();
        ((B)a).m();
    }
}
