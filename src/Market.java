import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Market {
  private  LinkedList<Employee> employees;

  Market(){
      employees= new LinkedList<>();
  }
    public Collection<Employee> getEmployees() {
        return employees;
    }

    public double getAverageMonthlySalary(){
    double result = 0;

    for(Employee i: employees){
        if(i.getWage().getWageType() == WageType.HOURLY) result+=20.8*8*i.getSalary();
        else if (i.getWage().getWageType() == WageType.FIXED) result+= i.getSalary();
        else {
            System.out.println("Wrong class");
            return 0;
        }
    }
    return result/(employees.size());

};

public void sortEmployees(){
    Collections.sort(employees,  new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.getWage().getSalary()>o2.getWage().getSalary()) return 1;
            else return 0;
        }
    });


}

}
