package HotelTuLam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManagement {
    List<Room> rooms = new ArrayList<>();
    // Them phan tu
    public void addRoomInfo(Room room){
        rooms.add(room);
    }
    // Xoa phan tu
    public void removeCustomerById(int id){
        rooms.removeIf(room -> room.getCustomer().getId() == id);
    }

    // Tim theo Id
    public void findCustomerById(int id){
        for (Room room: rooms) {
            if(room.getCustomer().getId()==id){
                room.getCustomer().showInfo();
            }
        }
    }
    // Thanh toan
    public void totalPayment(int id){
        for (Room room: rooms) {
            if(room.getCustomer().getId()==id){
                System.out.println("Tổng thanh toán : "+ room.getPrice()*room.getDays());
            }
        }
    }

    public void showInfoRoom(){
        for (Room room: rooms) {
            room.showRoomInfo();
        }
    }


    public int findIdCustomer(int id){
        int index = -1;
        for(Room room: rooms){
            if(room.getCustomer().getId()==id){
                index = id;
                break;
            }
        }return index;
    }


    public void editInfoCustomer(int id){
        int index =findIdCustomer(id);
        if(index!=-1){
            rooms.get(index).showRoomInfo();
            rooms.get(index).inputRoomInfo();
            rooms.get(index).showRoomInfo();
        }else{
            System.out.println("Không tìm thấy số CMND phù hợp");
        }
    }

}
