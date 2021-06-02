package com.company;
public class main {
    public static void  main(String[] args){
        Human me = new Human("Patryk","Aleksandrowicz",21,"men", 99999.0);
        Car auto = new Car("A3","Audi","120k", 100000.0);

        me.setCar(auto);

    }
}