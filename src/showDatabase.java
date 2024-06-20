import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class showDatabase {
    @SuppressWarnings("resource")
    public void showData() throws IOException {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter The ID You Want To Search: ");
        String ID = S.nextLine();
        String fileName = "File" + ID + ".txt";
        File F = new File("E:\\Employee_Management\\Database\\" + fileName);
        if (F.exists()) {
            System.out.println("\n\n");
            Scanner fileReader = new Scanner(F);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } else {
            System.out.println("\n\n-----Employee Not Found !!-----\n\n");
        }
    }
}