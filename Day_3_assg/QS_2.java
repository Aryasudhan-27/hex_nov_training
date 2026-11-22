import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seats = new String[3];
        Queue<String> waitlist = new LinkedList<>();

        String[] learners = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};

        for (String learner : learners) {
            boolean assigned = false;

            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == null) {
                    seats[i] = learner;
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                waitlist.add(learner);
            }

            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        }

        System.out.println("Ravi drops out");

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null && seats[i].equals("Ravi")) {
                seats[i] = null;

                if (!waitlist.isEmpty()) {
                    seats[i] = waitlist.poll();
                }

                break;
            }
        }

        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + waitlist);

        sc.close();
    }
}