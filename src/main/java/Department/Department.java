package Department;

public class Department {

    int dno;
    String dname;
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }



    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    public Department() {
    }

}
