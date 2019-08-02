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

        market.sortEmployees();
        for(Iterator i = market.getEmployees().iterator(); i.hasNext(); i.next()){
            System.out.println(market.getEmployees().iterator());
        }
       Iterator i = market.getEmployees().iterator();

    }

}
