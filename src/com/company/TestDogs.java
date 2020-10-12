package com.company;

public class TestDogs {
    public static void main(String[] args){
        Poodle poodle=new Poodle(5,"Jack","White");
        System.out.println(poodle.toString());;
        Doberman doberman=new Doberman(4,"Jason","Brown");
        System.out.println(doberman.toString());
    }
}
