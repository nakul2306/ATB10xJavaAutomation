package ex_18_OOPs_Constructor;

public class Car2 {
    String model;
    int year;

    Car2() {
        System.out.println("DC");
    }

    // param Constructor

    Car2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;

    }
}
