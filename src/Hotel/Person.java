package Hotel;

import java.util.Scanner;

public class Person {
    private String name;
    private String dateOfBirth;
    private int id;

    public Person() {
    }

    public Person(String name, String dateOfBirth, int id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng : ");
        this.name = scanner.nextLine();
        System.out.print("Nhập ngày sinh khách hàng : ");
        this.dateOfBirth = scanner.nextLine();
        System.out.print("Nhập số CMND khách : ");
        this.id = scanner.nextInt();
    }

    public void showInfo(){
        System.out.printf("Tên: %s, Ngày sinh : %s, Số CMND: %s", this.name, this.dateOfBirth, this.id);
    }
}
