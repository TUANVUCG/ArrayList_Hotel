package Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Customer : ");
        int number = scanner.nextInt();
        Room[] rooms = new Room[number];
        RoomManagement roomManagement = new RoomManagement(rooms);
        int choice = -1;
        do{
            menu();
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 : {
                    roomManagement.inputRooms();
                    break;
                }
                case 2: {
                    roomManagement.showRooms();
                    break;
                }
                case 3 : {
                    scanner.nextLine();
                    System.out.println("Enter Customer's id ");
                    String id = scanner.nextLine();
                    roomManagement.deleteCustomer(id);
                    break;
                }
                case 4: {
                    scanner.nextLine();
                    System.out.println("Enter Customer's id ");
                    String id = scanner.nextLine();
                    roomManagement.totalMoneyForPayment(id);
                    break;
                }

                case 5: {
                    Room room = new Room();
                    room.inputRoomInfo();
                    roomManagement.addNewRoom(room);
                    break;
                }
            }
        }while (choice != 0);
    }

    private static void menu() {
        System.out.println("1. Enter info customer ");
        System.out.println("2. Show info customer ");
        System.out.println("3. Remove info customer ");
        System.out.println("4. Payment ");
        System.out.println("5. Add info a customer ");
        System.out.println("0. Exit ");
    }
}
