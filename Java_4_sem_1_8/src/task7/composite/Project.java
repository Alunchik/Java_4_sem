package task7.composite;


public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer dev1 = new JavaDeveloper();
        Developer dev2 = new JavaDeveloper();
        Developer dev3 = new CppDeveloper();
        team.addDev(dev1);
        team.addDev(dev2);
        team.addDev(dev3);

        team.createProject();
    }
}
