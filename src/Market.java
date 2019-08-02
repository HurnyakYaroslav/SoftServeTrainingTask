import java.util.*;

public class Market {
  private  LinkedList<Employee> employees;

  Market(){
      employees= new LinkedList<>();
  }
    public LinkedList<Employee> getEmployees() {
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
 for(int i = 0; i<employees.size();i++){
    // if(employees.listIterator())

    }


}

}
