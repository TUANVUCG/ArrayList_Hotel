package BienLaiTienDien;

import java.util.Scanner;

public class Customer {
    private String name;
    private int homeNumber;
    private String electricCode;

    public Customer() {
    }

    public Customer(String name, int homeNumber, String electricCode) {
        this.name = name;
        this.homeNumber = homeNumber;
        this.electricCode = electricCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getElectricCode() {
        return electricCode;
    }

    public void setElectricCode(String electricCode) {
        this.electricCode = electricCode;
    }

    public void inputInfoCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin khách hàng");
        System.out.print("Nhập họ tên chủ hộ : ");
        this.name = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        this.homeNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập mã số công tơ điện : ");
        electricCode = sc.nextLine();
    }

    public void showInfoCustomer(){
        System.out.printf("Tên chủ hộ: %s , Số nhà :%d , Mã số công tơ điện : %s    ", this.name, this.homeNumber, this.electricCode);
    }
}
