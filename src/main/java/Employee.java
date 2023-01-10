import java.io.FileWriter;
import java.io.IOException;
public class Employee {
    int id;
    String name;
    int salary ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public Employee() {
    }

    public Employee(int id,String name, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }



    public void print_list (){

        try {
            FileWriter myWriter = new FileWriter("Employees.txt");
            for(int i=1;i<=10;i++) {
                myWriter.write("ID = " + i + "  name=" + i + "  salary = " + i * 1000+ "\n" );
            }
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    public void xd(){
        System.out.println("ff");
    }
}
