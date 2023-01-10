package Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testEmployee {

    public static void main(String[] args) {



        try {
            FileWriter myWriter = new FileWriter("src/main/java/Employee/Employees.txt");
            for(int i=1;i<=10;i++) {
                myWriter.write("ID = " + i + "  name=" + i + "  salary = " + i * 1000+ "\n" );
            }
            myWriter.close();
            File EmployeesList = new File("src/main/java/Employee/Employees.txt");
            Scanner myReader = new Scanner(EmployeesList);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        }
    }

