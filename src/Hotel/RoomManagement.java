package Hotel;

public class RoomManagement {
    private Room[] rooms;

    public RoomManagement(Room[] rooms) {
        this.rooms = rooms;
    }


    public void inputRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].inputRoomInfo();
        }
    }

    public Room[] addNewRoom(Room room) {
        Room[] newRooms = new Room[this.rooms.length + 1];
        for (int i = 0; i < this.rooms.length; i++) {
            newRooms[i] = rooms[i];
        }
        newRooms[this.rooms.length] = room;
        rooms = newRooms;
        return rooms;
    }

    public void showRooms() {
        for (Room room : rooms) {
            room.showRoomInfo();
        }
    }

    public int findCustomerById(String id) {
        int index = -1;
        for (int i = 0; i < rooms.length; i++) {
            if (id.equals(rooms[i].getCustomer().getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Room[] deleteCustomer(String id) {
        Room[] newRoom = new Room[rooms.length - 1];
        int index = findCustomerById(id);
        for (int i = 0; i < index; i++) {
            newRoom[i] = rooms[i];
        }
        for (int i = index + 1; i < newRoom.length; i++) {
            newRoom[i - 1] = rooms[i];
        }
        rooms = newRoom;
        return rooms;
    }

    public Room[] totalMoneyForPayment(String id) {
        int index = findCustomerById(id);
        if (index == -1) {
            System.out.println("Not find this id : ");
            return rooms;
        } else {
            System.out.println("Total for Payment is : " + rooms[index].getDay() * rooms[index].getPrice());
            return deleteCustomer(id);
        }
    }

}
