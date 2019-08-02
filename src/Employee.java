import java.util.Comparator;

public class Employee {
private Wage wage = new Wage();

Employee(){
}
Employee(Double salary, WageType wageType){
    this.wage.setSalary(salary);
    this.wage.setWageType(wageType);
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
                "wage=" + wage +
                "wageType=" + this.wage.getWageType()+
                "}\n";
    }

}

