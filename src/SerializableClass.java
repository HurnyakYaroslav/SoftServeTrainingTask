import java.io.Serializable;
import java.util.LinkedList;

public class SerializableClass implements Serializable {
        private LinkedList<Employee> list;

        SerializableClass(LinkedList<Employee> list) {
            this.list = list;
        }

        public LinkedList<Employee> getList() {
            return list;
        }
}
