package Companies;

import java.util.HashMap;
import java.util.Map;

class Employee{
    String name;
    String dept;
    int salary;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class PublicisMapUsage {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee("Ankit", "QAE", 15000));
        map.put(2, new Employee("Rashmi", "AE", 16000));

        for(Map.Entry<Integer, Employee> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().name);
            System.out.println(entry.getValue().dept);
            System.out.println(entry.getValue().salary);
        }
    }
}
