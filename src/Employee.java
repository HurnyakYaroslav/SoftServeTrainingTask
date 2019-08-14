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
        return this.wage.getSalary()==obj.wage.getSalary();

    }
    static int compareNames(Employee o1, Employee o2){
       return o1.getName().compareTo(o2.getName());
    }
    static int salarySubstraction(Employee o1, Employee o2){
        return (int)(o1.getSalary()-o2.getSalary());
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

