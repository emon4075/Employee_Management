import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class writeDatabase {
    public void createFile() throws IOException {
        employeeDetails Emp = new employeeDetails();
        Emp.getInfo();
        String fileName = "File" + Emp.ID + ".txt";
        File F = new File("E:\\Employee_Management\\Database\\" + fileName);
        if (F.createNewFile()) {
            FileWriter G = new FileWriter("E:\\Employee_Management\\Database\\" + fileName);
            G.write("Employee Name : " + Emp.Name + "\n"
                    + "Employee Father's Name : " + Emp.F_Name + "\n"
                    + "Employee Contact No : " + Emp.Contact + "\n"
                    + "Employee Posoition : " + Emp.Postion + "\n"
                    + "Employee ID : " + Emp.ID + "\n");
            G.close();
            System.out.println("\n\n-----Employee Added !!-----\n\n");
        } else {
            System.out.println("\n\n-----Employee Already in Database !!-----\n\n");
        }
    }
}
