package Hotel;

import java.util.ArrayList;
import java.util.List;

public class RoomManagement {
    List<Room> rooms = new ArrayList<>();
    // Tìm Id
    public int findIdCustomer(int id) {
        int index = -1;
        for (Room room : rooms) {
            if (room.getCustomer().getId() == id) {
                index = id;
                break;
            }
        }
        return index;
    }
    // Them phan tu
    public void addRoomInfo(Room room) {
        rooms.add(room);
    }

    // Xoa phan tu
    public void removeCustomerById(int id) {
        int index = findIdCustomer(id);
        rooms.removeIf(room -> room.getCustomer().getId() == index);
    }


    // Tim theo Id
    public void findCustomerById(int id) {
        for (Room room : rooms) {
            if (room.getCustomer().getId() == id) {
                room.getCustomer().showInfo();
            }
        }
    }

    // Thanh toan
    public void totalPayment(int id) {
        for (Room room : rooms) {
            if (room.getCustomer().getId() == id) {
                System.out.println("Tổng thanh toán : " + room.getPrice() * room.getDays());
            }
        }
    }
    // Hien thi thong tin phong
    public void showInfoRoom() {
        for (Room room : rooms) {
            room.showRoomInfo();
        }
    }


    // Sua thong tin khach hang
    public void editInfoCustomer(int id) {
        int index = findIdCustomer(id);
        if (index != -1) {
            rooms.get(index - 1).inputRoomInfo();
        } else {
            System.out.println("Không tìm thấy số CMND phù hợp !");
        }
    }

}
