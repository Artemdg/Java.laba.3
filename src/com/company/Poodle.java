package com.company;

public class Poodle extends dog {
    public Poodle(int n,String name,String color){
        super(n,name,color);
    }
    public String toString(){
        return "Пудель:\n"+"Имя:"+ getName()+" Возраст:"+getAge()+" Цвет:"+getColor();
    }
}
