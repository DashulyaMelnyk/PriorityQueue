package pack;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    // class comparator for priority queue

    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() > s2.getCGPA())
            return -1;
        else if (s1.getCGPA() < s2.getCGPA())
            return 1;
        else if (s1.getCGPA() == s2.getCGPA()){ //the variant when cgpa are the same
            int i = s1.getName().compareTo(s2.getName());
            if(i == 0) { //when cgpa and names are the same
                return Integer.compare(s1.getID(), s2.getID());
            } else return i;
        }
        return 0;
    }
}