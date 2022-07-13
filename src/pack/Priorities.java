package pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {



    public List<Student> getStudents(List<String> events){

        int s = events.size();
        PriorityQueue<Student> studentsPriority =  new PriorityQueue<>(new StudentComparator());
        for (String e : events){
            String[] words;
            words = e.split(" ");
            switch (words[0]){
                case "ENTER":
                    //System.out.println("ENTER");
                    studentsPriority.add(new Student(Integer.parseInt(words[3]), words[1], Double.parseDouble(words[2])));
                    break;
                case "SERVED":
                    //System.out.println("SERVED");
                    studentsPriority.poll();
                    break;
                default:
                    System.out.println("No match. Error in line!");
            }
        }
        return new ArrayList<>(studentsPriority);
    }

}
