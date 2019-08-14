import java.util.*;

public class Main {
    public static void main(String[] args) {
 Market market = new Market();

market.readEmployeesFromFile();

        for(int i = 0; i<25; i++){
            market.insertEmployee((Integer.toString(i+5)), i+5.0, WageType.HOURLY);
        }


        for(int i = 0; i<25; i++){
             market.insertEmployee(Integer.toString(i+5),(i + 5.0), WageType.FIXED);
        }

        System.out.println("Average monthly salary is: " + (int)market.getAverageMonthlySalary());

     //   Problem A

        Collections.sort(market.getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.equals(o2)) return Employee.compareNames(o1, o2);
//                if(o1.getSalary()==o2.getSalary()) return o1.getName().compareTo(o2.getName());
                return Employee.salarySubstraction(o1,o2);
            }
        });
        System.out.println("Sorted employees: \n" + market.getEmployees());

        //Problem B
        System.out.println("Information of first 5 employees");
        market.printEmployees(5);

        //Problem C
        System.out.println("ID of 3 last employees: ");
        market.printInfoAboutReverseEmployees(3);

        //Reading and writing objects into file
        Saving saving = new Saving();
        saving.getSavingForm(market);
        market.writeEmployeesIntoFile();
        System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
    }


}
