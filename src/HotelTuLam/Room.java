package HotelTuLam;

import java.util.Scanner;

public class Room {
    private double days;
    private String type;
    private double price;
    private Person customer = new Person();

    public Room() {
    }

    public Room(double days, String type, double price, Person customer) {
        this.days = days;
        this.type = type;
        this.price = price;
        this.customer = customer;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public void inputRoomInfo(){
        this.customer.inputInfo();
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhập số ngày trọ :");
        this.days = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập loại phòng trọ : ");
        this.type = scanner.nextLine();
        System.out.print("Nhập giá phòng : ");
        this.price = scanner.nextDouble();
    }


    public void showRoomInfo(){
        this.customer.showInfo();
        System.out.printf("Số ngày trọ : %f, Loại phòng: %s, Giá phòng : %f\n", this.days,this.type, this.price);
    }
}
