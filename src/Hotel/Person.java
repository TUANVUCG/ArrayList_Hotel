package Hotel;

import java.util.Scanner;

public class Person {
    private String name;
    private String birthOfDate;
    private String id;

    public Person() {
    }

    public Person(String name, String birthOfDate, String id) {
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void inputPersonInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter birth of date : ");
        this.birthOfDate = scanner.nextLine();
        System.out.println("Enter the id : ");
        this.id = scanner.nextLine();
    }
    public void showPersonInfo(){
        System.out.printf("Name:  %s, Date of birth : %s, Id : %s ", name, birthOfDate,id);
    }
}
