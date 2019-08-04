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
        if(i.getWage().getWageType() == WageType.HOURLY) result+=20.8*8*i.getSalary();
        else if (i.getWage().getWageType() == WageType.FIXED) result+= i.getSalary();
        else {
            System.out.println("Wrong class");
            return 0;
        }
    }
    return result/(employees.size());

};

  public void writeEmployeesIntoFile(){
String  fileName = new String(System.getProperty("user.dir") + "/MyCollection.bin");
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
        System.out.println(name);
        throw new IncorrectFileName("Name_Error");
    }
    String  fileName = new String(System.getProperty("user.dir") + "/"+ name);
    File file = new File(fileName);
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
    System.out.println("IncorrectFileName: ");
}
  }

  public void readEmployeesFromFile(){
      String  fileName = new String(System.getProperty("user.dir") + "/MyCollection.bin");
      try {
          FileInputStream fis = new FileInputStream(fileName);
          ObjectInputStream ois = new ObjectInputStream(fis);
//          SerializableClass employees_sub;
//          employees_sub = (SerializableClass) ois.readObject();
//          employees.addAll(employees_sub.list);
//          employees.addAll(((SerializableClass) ois.readObject()).getList());  WRONG
          employees = (((LinkedList<Employee>) ois.readObject()));
          fis.close();
      }
      catch (Exception ex){
          System.out.println("Can`t open file for reading");
          ex.printStackTrace();
      }
  }

}
