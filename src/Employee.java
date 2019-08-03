import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Serializable {
    private String name;
private Wage wage = new Wage();

Employee(){
}
Employee(String name, Double salary, WageType wageType){
    this.setName(name);
    this.wage.setSalary(salary);
    this.wage.setWageType(wageType);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public double getSalary() {
        return wage.getSalary();
    }

    public Wage getWage() {
        return wage;
    }

    public boolean equals(Employee obj) {
        return this.wage.getSalary()>obj.wage.getSalary();

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                "wage=" + wage +
                "wageType=" + this.wage.getWageType()+
                "}\n";
    }


}

