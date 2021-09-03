package com.crz;

public class Polymorphism {
    public static void main(String[] args) {
        person p1=new student();
        person p2=new person();
        //student p3= (student) new person();
        person p4=new person();
        p1.run();
        p2.run();
        //p3.run();
        //p1.run();

    }

}
class person{
    public void run(){
        System.out.println("I am a Person");
    }

}
class student extends person{
    @Override
    public void run() {
        System.out.println("I am a Student");
    }
}
