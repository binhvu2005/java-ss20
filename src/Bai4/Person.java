package Bai4;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
	public void getAge(){
        System.out.println("Name: " + name + " Age: " + (LocalDate.now().getYear() - birthDate.getYear()));
    }
    public void printPerson(){
        System.out.println("Name: " + name + " Birthdate: " + birthDate + " Age: " + (LocalDate.now().getYear() - birthDate.getYear()));
    }
}
