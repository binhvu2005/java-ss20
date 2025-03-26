package Bai3;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> phoneNumber;

   public User(String name, Optional<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
   }
    public  User(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Optional<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void display(){
        if (phoneNumber != null){
            System.out.println("Name: " + name + " Phone number: " + phoneNumber);
        } else {
            System.out.println("Name: " + name + " Phone number: khong co");
        }
    }
}
