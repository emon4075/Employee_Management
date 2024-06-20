import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        mainMenu MM = new mainMenu();
        MM.Menu();
        Scanner S = new Scanner(System.in);
        int Choice = 0;
        while (true) {
            System.out.print("Enter Your Choice : ");
            Choice = Integer.parseInt(S.nextLine());
            if (Choice == 1) {
                writeDatabase WD = new writeDatabase();
                WD.createFile();
                MM.Menu();
            } else if (Choice == 2) {
                showDatabase Obj = new showDatabase();
                Obj.showData();
                MM.Menu();
            } else if (Choice == 3) {
                removeEmployee Emp = new removeEmployee();
                Emp.rmEmp();
                MM.Menu();
            } else if (Choice == 4) {
                exitEMS EE = new exitEMS();
                EE.Out();
            }
        }
    }
}
