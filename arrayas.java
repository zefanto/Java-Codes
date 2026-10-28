import java.util.Scanner;
import java.util.ArrayList;
public class arrayas {
    public static void main(String[] args) {
        String task = "";
        Scanner input = new Scanner(System.in);
        String[] items = {"Wash car", "Clean kitchen", "Sweep floor"};
        System.out.println(items[1]);

        ArrayList<String> todolist = new ArrayList<>();
        todolist.add("Wash Car");
        todolist.add("Clean Kitchen");
        todolist.add("Sweep Floor");

        System.out.println("The To-Do List:");
        System.out.println(todolist);

        while (!task.equalsIgnoreCase("done")) {
            System.out.print("Enter a new task to add. Enter ''done'' if you're finished: ");
            task = input.nextLine();
            if (!task.equalsIgnoreCase("done")) {
                todolist.add(task);
            }
        }

        System.out.println("Here is the Final list");
        System.out.println(todolist);




    }
}