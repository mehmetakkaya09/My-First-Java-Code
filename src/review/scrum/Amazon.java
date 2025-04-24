package review.scrum;

public class Amazon {

    public static void main(String[] args) {

        String company = "Amazon";

        ProductOwner po = new ProductOwner("Blagoja", 46, 'M',100000, "IT");

        BusinessAnalyst ba = new BusinessAnalyst("Süreyya", 32, 'F', 80000,"IT");

        ScrumMaster sm = new ScrumMaster("Vadim", 26,'M',90000,"IT");

        Tester tester1=new Tester("Chinara",32,'F',125000,"IT");

        Tester tester2=new Tester("Yasaman",31,'F', 130000,"IT");

        Tester tester3=new Tester("Irena",29,'F',128000,"IT");

        Tester tester4=new Tester("Cihad",26,'M',125000,"IT");

        Tester[] testers = {tester1, tester2, tester3, tester4};


        Developer developer1=new Developer("Max", 40, 'M',  180000, "IT");

        Developer developer2=new Developer("Allison", 18, 'F',   120000, "IT");

        Developer developer3=new Developer("Tom", 26, 'M',  140000, "IT");

        Developer developer4=new Developer("Manas", 40, 'M',  280000, "IT");

        Developer developer5=new Developer("Evelyn", 30, 'F',  160000, "IT");

        Developer[] developers = {developer1, developer2, developer3, developer4, developer5};

        ScrumTeam team = new ScrumTeam(po,sm,ba);

        team.addTester(tester1);
        team.deleteTesterById(tester1.getId());

        team.addDeveloper(developer1);
        team.deleteDeveloperById(developer1.getId());

        team.addTesters(testers);

        team.addDevelopers(developers);

        team.getAllDevTeam();

        System.out.println(team);

        tester4.work();
        developer5.work();
        po.work();
        ba.work();
        sm.work();
        tester2.sleep(8);


    }
}
