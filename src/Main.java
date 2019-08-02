import java.util.*;

public class Main {
    public static void main(String[] args) {
Market market = new Market();
for(int i = 0; i<25; i++){
    market.getEmployees().add(new Employee(i+5.0, WageType.HOURLY));
}

        for(int i = 0; i<25; i++){
             market.getEmployees().add(new Employee(i + 5.0, WageType.FIXED));
        }
        System.out.println("Average monthly salary is: " + (int)market.getAverageMonthlySalary());

     //   market.sortEmployees(); need to be changed
        System.out.println("Sorted employees: \n" + market.getEmployees());



        ListIterator<Employee> it = market.getEmployees().listIterator();
        //Problem B
        System.out.println("ID of first 5 employees");
       if(market.getEmployees().size()>=5) for(int i = 0; i<5;i++){
            System.out.println(it.next());
        }

        //Problem C
        System.out.println("ID of 3 last employees: ");
        while(it.hasNext()) it.next();
            for(int i = 0; i<3;i++){
                System.out.println(it.previous());
        }






    }

}
