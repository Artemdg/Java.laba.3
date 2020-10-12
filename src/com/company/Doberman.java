package com.company;

public class Doberman extends dog{
    public Doberman(int n,String name,String color){
        super(n,name,color);
    }
    public String toString(){
        return "Доберман:\n"+"Имя:"+ getName()+" Возраст:"+getAge()+" Цвет:"+getColor();
    }
}
