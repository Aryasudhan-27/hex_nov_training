import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();
                    stack.push(name);
                    System.out.println("Enrolled: " + name);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Undone: " + stack.pop());
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Last enrolled: " + stack.peek());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}