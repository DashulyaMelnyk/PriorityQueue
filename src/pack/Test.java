package pack;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Priorities priorities = new Priorities();
        Scanner in = new Scanner(System.in);

        int eventsAmount = Integer.parseInt(in.nextLine());
        List<String> events = new ArrayList<>();

        while (eventsAmount != 0) {
            String event = in.nextLine();
            events.add(event);
            eventsAmount--;
        }
        List<Student> students = priorities.getStudents(events);
        if (!students.isEmpty()) {
            for (Student st: students) {
                System.out.println(st.getName() + "\n");
            }
        } else {
            System.out.println("EMPTY");
        }
    }
}
