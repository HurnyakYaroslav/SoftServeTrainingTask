import java.io.*;
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
        switch (i.getWage().getWageType()){
            case FIXED:
                result+= i.getSalary();
                break;
            case HOURLY:
                result+=20.8*8*i.getSalary();
                break;
            default:
                System.out.println("Wrong class");
                return 0;
        }
    }
    result/=employees.size();
    return result;

};

  public void writeEmployeesIntoFile(){
String  fileName = (System.getProperty("user.dir") + "/MyCollection.bin");
try{
    FileOutputStream fo = new FileOutputStream(fileName);
    ObjectOutputStream oos = new ObjectOutputStream(fo);
    oos.writeObject(employees);
    fo.close();
}
catch(IOException ex){
    System.out.println("Can`t open file for writing");
    ex.printStackTrace();
}
  }

  public void writeEmployeesIntoFile(String name){
try{
    if(!name.matches("^[a-zA-Z1-9]+\\.bin")){
        throw new IncorrectFileName("Name_Error");
    }
    String  fileName = System.getProperty("user.dir") + "/"+ name;
    new File(fileName);
    FileOutputStream fo = new FileOutputStream(fileName);
    ObjectOutputStream oos = new ObjectOutputStream(fo);
    oos.writeObject(employees);
    fo.close();
}
catch(IOException ex){
    System.out.println("Can`t open file for writing");
    ex.printStackTrace();
}
catch (IncorrectFileName ifn){
    System.out.println("IncorrectFileName: " + name);
}
  }

  public void readEmployeesFromFile(){
      String  fileName = System.getProperty("user.dir") + "/MyCollection.bin";
      try {
          FileInputStream fis = new FileInputStream(fileName);
          ObjectInputStream ois = new ObjectInputStream(fis);
          employees = (((LinkedList<Employee>) ois.readObject()));
          fis.close();
      }
      catch (Exception ex){
          System.out.println("Can`t open file for reading");
          ex.printStackTrace();
      }
  }


  public void printEmployees(int numberToPrint){
      ListIterator<Employee> it = this.getEmployees().listIterator();
      for(int j=0; j<numberToPrint;j++){
          System.out.println(it.next());
      }
  }

  public void printInfoAboutReverseEmployees(int numberToPrint){
      ListIterator<Employee> it = this.getEmployees().listIterator();
      while(it.hasNext()) it.next();
      for(int j=0; j<numberToPrint;j++){
          System.out.println(it.previous().hashCode());
      }
  }

  public Employee insertEmployee(String name, Double salary, WageType wageType){
      Employee employee = new Employee(name, salary, wageType);
      this.getEmployees().add(employee);
      return employee;
  }

}
