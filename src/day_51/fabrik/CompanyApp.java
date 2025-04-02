package day_51.fabrik;

public class CompanyApp {

    public static void main(String[] args) {

        Company company1 = new Company("EuroTech", "Oberursel");

        Driver driver = new Driver("Zack", 45,"Bus");

        Engineer engineer = new Engineer("Patrick", 33, "Humbolt");

        Teacher teacher = new Teacher("Linda", 29);

        Volunteer volunteer = new Volunteer("Mary", 34);

        Worker worker = new Worker("Cindy", 25, "Kitchen");

        company1.addPerson(driver);
        company1.addPerson(engineer);
        company1.addPerson(teacher);
        company1.addPerson(volunteer);
        company1.addPerson(worker);

        company1.getAllPersons2();

        for (Person person : company1.getAllPersons()) {
            if (person instanceof Driver driver1) {
                driver1.driveVehicle();
            } else if (person instanceof Engineer engineer1) {
                engineer1.design("Phone");
            }else if (person instanceof Volunteer volunteer1) {
                volunteer1.work();
            } else if (person instanceof Teacher teacher1) {
                teacher1.pay(3000);
            }else if (person instanceof Worker worker1) {
                worker1.showInfo();
            }
        }











    }


}
