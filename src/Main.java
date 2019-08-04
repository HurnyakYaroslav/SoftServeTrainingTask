import java.util.*;

public class Main {
    public static void main(String[] args) {
 Market market = new Market();

market.readEmployeesFromFile();

//for(int i = 0; i<25; i++){
//    market.getEmployees().add(new Employee((Integer.toString(i+5)), i+5.0, WageType.HOURLY));
//}


//        for(int i = 0; i<25; i++){
//             market.getEmployees().add(new Employee((Integer.toString(i+5)),(i + 5.0), WageType.FIXED));
//        }
//        System.out.println("Average monthly salary is: " + (int)market.getAverageMonthlySalary());

     //   Problem A

        Collections.sort(market.getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()==o2.getSalary()) return o1.getName().compareTo(o2.getName());
                return (int)(o1.getSalary()-o2.getSalary());
            }
        });
        System.out.println("Sorted employees: \n" + market.getEmployees());


        ListIterator<Employee> it = market.getEmployees().listIterator();
        //Problem B
        System.out.println("Information of first 5 employees");
       if(market.getEmployees().size()>=5) for(int i = 0; i<5;i++){
            System.out.println(it.next());
        }

        //Problem C
        System.out.println("ID of 3 last employees: ");
        while(it.hasNext()) it.next();
            for(int i = 0; i<3;i++){
                System.out.println(it.previous().hashCode());
        }
//Reading and writing objects into file
        Saving saving = new Saving();
            saving.getSavingForm(market);
//        market.writeEmployeesIntoFile();
//      System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
    }


}
