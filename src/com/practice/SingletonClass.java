package com.practice;

public class SingletonClass {

    private SingletonClass(){}

    private static SingletonClass instance = null;

    public static SingletonClass newInstance(){
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
