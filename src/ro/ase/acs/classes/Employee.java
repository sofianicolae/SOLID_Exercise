package ro.ase.acs.classes;

public class Employee {
    private int id;
    private String name;
    private String adress;
    private float salary;

    public Employee(int id, String name, String adress, float salary) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", salary=" + salary +
                '}';
    }
}
