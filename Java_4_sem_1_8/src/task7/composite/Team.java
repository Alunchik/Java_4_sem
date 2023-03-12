package task7.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
//    composite
    private List<Developer> devs = new ArrayList<>();
    public void addDev(Developer dev){
        devs.add(dev);
    }
    public void removeDeveloper(Developer dev){
        devs.remove(dev);
    }
    public void createProject(){
        System.out.println("Team creates project");
        for(Developer dev: devs){
            dev.writeCode();
        }
    }
}
