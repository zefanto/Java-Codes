import java.util.Scanner;
    public class Time {

        private String taskname;
        private Integer minutes;
        private Boolean completed;


        public Time(String taskName, Integer minutes) {
            this.taskname = taskName;
            this.minutes = minutes;
            this.completed = false;
        }


        public String getTaskName() {
            return taskname;
        }

        public Integer getMinutes() {
            return minutes;
        }

        public Boolean getCompleted() {
            return completed;
        }

        public void setMinutes(Integer minutes) {
            this.minutes = minutes;
        }

        public void setCompleted(Boolean completed) {
            this.completed = completed;
        }

        public void displayTask() {
            System.out.println("task: " + taskname);
            System.out.println("time: " + minutes + " minutes");
            System.out.println("completed: " + completed);

    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter your task: ");
        String task1 = input.nextLine();
        System.out.print("enter time in minutes: ");
        Integer mins1 = input.nextInt();
        input.nextLine();

        System.out.print("is it completed?: ");
        Boolean done1 = input.nextBoolean();
                input.nextLine();


        Time mytask1 = new Time(task1, mins1);
        mytask1.setCompleted(done1);

        System.out.print("enter your task: ");
        String task2 = input.nextLine();
        System.out.print("enter time in minutes: ");
        Integer mins2 = input.nextInt();
        input.nextLine();

        System.out.print("is it completed?: ");
        Boolean done2 = input.nextBoolean();
        input.nextLine();


        Time mytask2 = new Time(task2, mins2);
        mytask2.setCompleted(done2);

        System.out.print("enter your task: ");
        String task3 = input.nextLine();
        System.out.print("enter time in minutes: ");
        Integer mins3 = input.nextInt();
        input.nextLine();

        System.out.print("is it completed?: ");
        Boolean done3 = input.nextBoolean();
        input.nextLine();
        Time mytask3 = new Time(task3, mins3);
        mytask3.setCompleted(done3);



        System.out.print("enter your task: ");
        String task4 = input.nextLine();
        System.out.print("enter time in minutes: ");
        Integer mins4 = input.nextInt();
        input.nextLine();

        System.out.print("is it completed?: ");
        Boolean done4 = input.nextBoolean();
        input.nextLine();


        Time mytask4 = new Time(task4, mins4);
        mytask4.setCompleted(done4);

        System.out.print("enter your task: ");
        String task5 = input.nextLine();
        System.out.print("enter time in minutes: ");
        Integer mins5 = input.nextInt();
        input.nextLine();

        System.out.print("is it completed?: ");
        Boolean done5 = input.nextBoolean();
        input.nextLine();


        Time mytask5 = new Time(task5, mins5);
        mytask5.setCompleted(done5);

        System.out.println("\nyour sechedule: ");
        mytask1.displayTask();
        mytask2.displayTask();
        mytask3.displayTask();
        mytask4.displayTask();
        mytask5.displayTask();


        input.close();


    }

}
