package task1;

import task1.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main{
    public static void main(String[] args) {

        Function<ArrayList<Student>, Map<String, List<Student>>> sort_students = (a) -> {
            Map<String, List<Student>> hm = new HashMap<>();
            for(Student st: a){
                if (hm.containsKey(st.getGroup())){
                    hm.get(st.getGroup()).add(st);
                }
                else{
                    List<Student> li = new ArrayList<>();
                    li.add(st);
                    hm.put(st.getGroup(), li);
                }
            }
            return hm;
        };


        ArrayList<Student> arr = new ArrayList<>();
    arr.add(new Student("IKBO-01-21", "Marov"));
        arr.add(new Student("IKBO-01-21", "Avdeeva"));
        arr.add(new Student("IKBO-01-21", "Alekperova"));
        arr.add(new Student("IKBO-01-21", "Vasilyev"));
        arr.add(new Student("IKBO-03-21", "Komolov"));
        arr.add(new Student("IKBO-03-21", "Vohrin"));
    Map<String, List<Student>> hm = sort_students.apply(arr);
    for(String group: hm.keySet()){
        System.out.print(group + ": ");
        for(Student st: hm.get(group)){
            System.out.print(st.getName() + ", ");
        }
        System.out.println();
    }
    }
}