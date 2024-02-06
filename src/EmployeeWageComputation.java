import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        Random random = new Random();


        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");


        boolean isPresent = random.nextBoolean();
        String attendanceStatus = isPresent ? "Present" : "Absent";
        System.out.println("\nEmployee is " + attendanceStatus);

        if (isPresent) {

            int workingHours = random.nextInt(9) + 1;
            System.out.println("\nEmployee worked " + workingHours + " hours today.");

            double hourlyWage;
            switch (workingHours) {
                case 1:
                case 2:
                case 3:
                    hourlyWage = 10.0;
                    break;
                case 4:
                case 5:
                case 6:
                    hourlyWage = 12.0;
                    break;
                default:
                    hourlyWage = 15.0;
            }

            double dailyWage = hourlyWage * workingHours;
            System.out.println("Daily wage: $" + dailyWage);


            double monthlyWage = dailyWage * 20;
            System.out.println("Monthly wage (assuming 20 working days): $" + monthlyWage);


            int totalHours = 0;
            int totalDays = 0;
            double totalMonthlyWage = 0.0;
            while (totalHours < 100 && totalDays < 20) {
                int currentHours = random.nextInt(9) + 1;
                workingHours += currentHours;
                totalHours += currentHours;
                totalDays++;

                dailyWage = hourlyWage * currentHours;
                totalMonthlyWage += dailyWage;

                System.out.println("\nDay " + totalDays + ": Worked " + currentHours + " hours, Daily wage: $" + dailyWage);
            }

            System.out.println("\nTotal wages earned in " + totalDays + " days and " + totalHours + " hours: $" + totalMonthlyWage);
        } else {
            System.out.println("\nSince employee is absent, daily and monthly wages are not calculated.");
        }
    }
}


