package day_29;

import java.util.ArrayList;

public class ManagementSystem {

     ArrayList<Employee> employees = new ArrayList<>();
    // addEmployee(Employee employee)
    // removeEmployeeById(int id)
    // getEmployeeById(int id)
    // getEmployees()

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " was saved by Id " + employee.getId());
    }

    public void removeEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id){
                employees.remove(employee);
                System.out.println(employee.getName() + " was removed by Id " + employee.getId());
                return;
            }
        }
    }

    public void getEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id){
                System.out.println(employee);
            }
        }
    }


}
