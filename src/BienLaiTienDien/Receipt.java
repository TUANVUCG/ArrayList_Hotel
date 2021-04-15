package BienLaiTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    private double oldIndex, newIndex ;
    private Customer customer = new Customer();


    public Receipt() {
    }

    public Receipt(double oldIndex, double newIndex, Customer customer, Scanner sc) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.customer = customer;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void inputReceiptInfo(){
        customer.inputInfoCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện mới: ");
        newIndex = sc.nextInt();
        System.out.print("Nhập số điện cũ: ");
        oldIndex = sc.nextInt();
    }

    public void showReceiptInfo(){
        customer.showInfoCustomer();
        System.out.printf("Số điện cũ là : %f, số điện mới là: %f\n", oldIndex,newIndex);
    }

    public double pay(){
        return (newIndex-oldIndex)*750;
    }
}
