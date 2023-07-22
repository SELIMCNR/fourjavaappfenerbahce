package com.selimcinar.firstapp;

public class Musicians {


    String name;
    String instrument;
    int age;

    //input girdisi yapar constructor.
   public Musicians(String name,String instrument,int age)
   {
       this.name=name;
       this.instrument=instrument;
       this.age=age;
       System.out.println("instance ok");
   }
}
