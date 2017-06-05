package com.gmail.s12348.evgen;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Test test=new Test();
        Class<?> cls=test.getClass();
        try {
            Method[] methods=cls.getMethods();
            MyAnnotation myAnnotation = null;
            for (Method method : methods){
                if (method.isAnnotationPresent(MyAnnotation.class))
                    myAnnotation= method.getAnnotation(MyAnnotation.class);
                method.invoke(test,myAnnotation.param1(), myAnnotation.param2());
            }
        } catch (IllegalAccessException| InvocationTargetException| IllegalArgumentException e){
            
        }





    }
}
