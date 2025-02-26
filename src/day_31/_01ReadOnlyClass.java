package day_31;

import java.util.ArrayList;

public class _01ReadOnlyClass {

    private String bundesland;
    private String stadt;

    // global access
    private static ArrayList<String> staedte = new ArrayList<>();

    public _01ReadOnlyClass(String bundesland, String stadt) {
        setBundesland(bundesland);
        setStadt(stadt);
    }

    public String getStadt() {
        return stadt;
    }

    public String getBundesland() {
        return bundesland;
    }

    private void setBundesland(String bundesland) {
        if (bundesland == null || bundesland.trim().equals("")){
            return;
        }
        this.bundesland = bundesland;
    }

    private void setStadt(String stadt) {
        if (stadt == null || stadt.trim().equals("")){
            return;
        }
        this.stadt = stadt;
        staedte.add(stadt);
    }

    public ArrayList<String> getStaedte() {
        System.out.println("System.identityHashCode(staedte) = " + System.identityHashCode(staedte));
        return new ArrayList<>(staedte);
    }

    public void getStaedte2(){
        for (String stadt : staedte) {
            System.out.println(stadt);
        }
    }

    @Override
    public String toString() {
        return "_01ReadOnlyClass{" +
                "bundesland='" + bundesland + '\'' +
                ", stadt='" + stadt + '\'' +
                '}';
    }
}
