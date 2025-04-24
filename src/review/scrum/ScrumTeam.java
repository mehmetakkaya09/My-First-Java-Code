package review.scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner PO;
    private ScrumMaster SM;
    private BusinessAnalyst BA;

    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner po, ScrumMaster sm, BusinessAnalyst ba) {
        this.PO = po;
        SM = sm;
        BA = ba;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void deleteTesterById(int id) {
        testers.removeIf(tester -> tester.getId() == id);

//        for (Tester tester : testers) {
//            if (tester.getId() == id) {
//                testers.remove(tester);
//            }
//        }
    }

    public void deleteDeveloperById(int id) {
        developers.removeIf(developer -> developer.getId() == id);
    }

    public void addTesters(Tester[] testerArray) {
        testers.addAll(Arrays.asList(testerArray));
    }

    public void addDevelopers(Developer[] developerArray) {
        developers.addAll(Arrays.asList(developerArray));
    }

    public void getAllDevTeam(){
        testers.forEach(tester -> System.out.println(tester.getName()));
        developers.forEach(developer -> System.out.println(developer.getName()));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.getName() +
                ", SM=" + SM.getName() +
                ", BA=" + BA.getName() +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }


}
