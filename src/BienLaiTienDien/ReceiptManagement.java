package BienLaiTienDien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptManagement {

    List<Receipt> receipts = new ArrayList<>();


    public  void addReceipt(Receipt receipt){
        receipts.add(receipt);
    }

    public void showInfo(){
        for (Receipt receipt: receipts) {
            receipt.showReceiptInfo();
        }
    }

    public void totalPayment(){
        int index =0;
        for(Receipt receipt: receipts){
            index ++;
            System.out.println("Tổng tiền thanh toán của hộ thứ " + index +" là : " + receipt.pay());
        }
    }
}
