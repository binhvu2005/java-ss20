package Bai9;

import java.time.LocalDate;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> deliveryDate;

    public Order(int id, String customerName, LocalDate createdDate, Optional<LocalDate> deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = deliveryDate;
    }
    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Optional<LocalDate> deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public void toDisplayString(){
        if (deliveryDate != null){
            System.out.println("ID: " + id + " Customer name: " + customerName + " Created date: " + createdDate + " Delivery date: " + deliveryDate);
        } else {
            System.out.println("ID: " + id + " Customer name: " + customerName + " Created date: " + createdDate + " Delivery date: chua giao");
        }
    }
}
