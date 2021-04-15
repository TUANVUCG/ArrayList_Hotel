package Hotel;

import java.util.Scanner;

public class Room {
    private double day;
    private String type;
    private double price;
    private Person customer = new Person();

    public Room() {
    }

    public Room(double day, String type, double price, Person customer) {
        this.day = day;
        this.type = type;
        this.price = price;
        this.customer = customer;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
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
        this.customer.inputPersonInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input days : ");
        day = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Input type : ");
        type = scanner.nextLine();
        System.out.println("Input price : ");
        price = scanner.nextDouble();
        scanner.nextLine();
    }

    public void showRoomInfo(){
        customer.showPersonInfo();
        System.out.printf("Day: %f, Type: %s, Price: %f\n", day, type, price);
    }
}
