package com.gmail.s12348.evgen;


import static java.lang.System.*;

public class Test {
   @MyAnnotation(param1=2,param2=5)
    public void test (int a, int b){
       out.println("Sum="+(a+b));
   }
}
