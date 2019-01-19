package exercice;

import java.util.ArrayList;

public class Service {
    ArrayList<Employee> emp = new ArrayList<>();
    private String name;
    public Service(String name){
        this.name = name;
    }

    public ArrayList<Employee> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<Employee> emp) {
        this.emp = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Employee empl){
        emp.add(empl);
    }

    public void delete(Employee empl){
        emp.remove(empl);
    }
}
