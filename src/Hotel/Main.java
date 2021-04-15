package Hotel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RoomManagement roomManagement = new RoomManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Room room = new Room();
                    room.inputRoomInfo();
                    roomManagement.addRoomInfo(room);
                    break;
                }
                case 2 : {
                    roomManagement.showInfoRoom();
                    break;
                }
                case 3: {
                    System.out.print("Nhập số CMND khách hàng cần xóa: ");
                    int id = scanner.nextInt();
                    roomManagement.removeCustomerById(id);
                    break;
                }
                case 5: {
                    System.out.println("Nhập số CMND khách hàng cần thanh toán : ");
                    int id = scanner.nextInt();
                    roomManagement.totalPayment(id);
                    break;
                }
                case  6 : {
                    System.out.println("Nhập số CMND cần sửa : ");
                    int id = scanner.nextInt();
                    roomManagement.editInfoCustomer(id);
                    break;
                }
                case 7: {
                    System.out.println("Nhập CMND khách hàng cần xem :");
                    int id = scanner.nextInt();
                    roomManagement.findCustomerById(id);
                    break;
                }
            }
        } while (choice != 0);

    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Thêm một khách hàng");
        System.out.println("2. Hiển thị thông tin khách hàng");
        System.out.println("3. Xóa thông tin một khách hàng");
        System.out.println("5. Thanh toán ");
        System.out.println("6. Sửa thông tin khách hàng ");
        System.out.println("7. Tìm kiếm khách hàng");
        System.out.println("0. Exit");
    }
}
