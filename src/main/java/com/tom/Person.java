package com.tom;

public class Person extends Object {
    String name;
    float weight;
    float height;

    public Person(float weight, float height) {  //方法內的區域變數
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height);  //這一定要在第一行
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
