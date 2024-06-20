import java.util.Scanner;

class employeeDetails {
    String Name, F_Name, Contact, Postion, ID;

    @SuppressWarnings("resource")
    public void getInfo() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        Name = S.nextLine();
        System.out.print("Enter Your Father's Name : ");
        F_Name = S.nextLine();
        System.out.print("Enter Your Contact No : ");
        Contact = S.nextLine();
        System.out.print("Enter Your Position : ");
        Postion = S.nextLine();
        System.out.print("Enter Your ID : ");
        ID = S.nextLine();
    }
}
