package com.company;
public class main {
    public static void  main(String[] args){

        Human me = new Human("Patryk","Aleksandrowicz",21,"men", 2000.0);

        Double mySalary = me.getSalary();
        Double newSalary = mySalary;
        me.setSalary(newSalary);

    }











}