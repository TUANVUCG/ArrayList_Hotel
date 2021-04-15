package BienLaiTienDien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReceiptManagement receiptManagement = new ReceiptManagement();
        int choice = -1;
        do {
            System.out.println("Nhập lựa chọn của bạn : ");
            System.out.println("1. Nhập thông tin các hộ sử dụng điện");
            System.out.println("2. Hiển thị thông tin về các biên lai đã nhập");
            System.out.println("3. Tính tiền điện");
            System.out.println("0. Thoát ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    Receipt receipt = new Receipt();
                    receipt.inputReceiptInfo();
                    receiptManagement.addReceipt(receipt);
                    break;
                }
                case 2: {
                    receiptManagement.showInfo();
                    break;
                }
                case 3: {
                    receiptManagement.totalPayment();
                    break;
                }

            }
        } while (choice != 0) ;
    }
}


