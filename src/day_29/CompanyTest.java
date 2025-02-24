package day_29;

public class CompanyTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(10001, "Blagoja", 50000);
        Employee employee2 = new Employee(10002, "Sureyya", 51000);
        Employee employee3 = new Employee(10003, "Vadim", 52000);
        Employee employee4 = new Employee(10004, "Mehmet", 45000);

        ManagementSystem ms = new ManagementSystem();
        ms.addEmployee(employee1);
        ms.addEmployee(employee2);
        ms.addEmployee(employee3);
        ms.addEmployee(employee4);

        ms.removeEmployeeById(10004);

        ms.getEmployees();

        ms.getEmployeeById(10002);






    }

}
