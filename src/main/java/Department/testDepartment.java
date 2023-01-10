package Department;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testDepartment {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/main/java/Department/Department.txt");
            for (int i = 1; i <= 10; i++) {
                myWriter.write("ID = " + i + "  name=" + i + "  salary = " + i * 1000 +
                        "    " + (i+100) + "  Department = " + (i + 100) + "\n");
            }
            myWriter.close();
            File DepartmentsList = new File("src/main/java/Department/Department.txt");
            Scanner myReader = new Scanner(DepartmentsList);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}