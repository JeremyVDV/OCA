package Exceptions;

import java.io.IOException;
import java.util.ArrayList;

// Voorbeeld 1
class A{
    protected void m() throws IOException{}
}
class B extends A{
    public void m(){}
    double b = 5;
}

class Data {
    private int x = 0;
    private String y = "Y";
    public Data(int k){
        this.x = k;
    }
    public Data(String k){
        this.y = k;
    }
    public void showMe(){
        System.out.println(x+y);
    }
}
class TestClass {
    public static void main(String[] args) throws Exception {
        new Data(10).showMe();
        new Data("Z").showMe();
    }
}

