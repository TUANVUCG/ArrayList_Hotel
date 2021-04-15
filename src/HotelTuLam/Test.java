package HotelTuLam;

import java.util.Scanner;

public class Test {
    public Room inputRoomInfo(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhập số ngày trọ :");
        double days=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại phòng trọ : ");
        String type=scanner.nextLine();
        System.out.print("Nhập giá phòng : ");
        double price=Double.parseDouble(scanner.nextLine());
        Person person=new Person();
        return new Room(days,type,price,person);
    }

}
