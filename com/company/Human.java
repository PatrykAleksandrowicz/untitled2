package com.company;
import java.util.Date;
/*ok*/
public class Human {
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;

    private Double salary;

    public Human(String firstName, String lastName, Integer age , String sex, Double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
        this.salary=salary;
    }


    public Double getSalary() {
        System.out.println("Pobrano kasiore;" + this.salary);
        System.out.println("Kiedy otrzymano kasiore" + new Date());
        return this.salary;
    }
    public void setSalary(Double salary) {
    if(salary <0){
        System.out.println("Ujemna wypłata");
    }
    else{
        System.out.println(" informacje o tym, że nowe dane zostały wysłane do systemu księgowego");
        System.out.println(" informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
        System.out.println(" info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        this.salary = salary;
    }
    }


}