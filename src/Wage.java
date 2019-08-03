import java.io.Serializable;

public class Wage implements Serializable {
    private WageType wageType;
   private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWageType(WageType wageType) {
        this.wageType = wageType;
    }

    public WageType getWageType() {
        return wageType;
    }

    @Override
    public String toString() {
        return "Wage{" +
                "wageType=" + wageType +
                ", salary=" + salary +
                '}';
    }
}





