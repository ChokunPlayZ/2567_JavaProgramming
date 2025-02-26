package Lab11;

public class Employee {
    private String dept;

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void header() {
        for (int i = 0; i < 70; i++) System.out.print("*");
        System.out.println();
    }
}
