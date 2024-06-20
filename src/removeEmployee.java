import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class removeEmployee {
    @SuppressWarnings("resource")
    public void rmEmp() throws IOException {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter The ID You Want Delete : ");
        String ID = S.nextLine();
        String fileName = "File" + ID + ".txt";
        File F = new File("E:\\Employee_Management\\Database\\" + fileName);
        if (F.exists()) {
            F.delete();
            System.out.println("\n\n-----Deleted Successfully !!-----\n\n");
        } else {
            System.out.println("\n\n-----Employee Not Found !!-----\n\n");
        }
    }
}
