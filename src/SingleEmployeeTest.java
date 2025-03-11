import java.util.Scanner;

public class SingleEmployeeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        System.out.println("Enter WorkExperience: ");
        int workExperience = sc.nextInt();

        System.out.println("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.println("How many months you want to calculate score: ");

        int months = sc.nextInt();
        int[] scores = new int[months];

        for (int i = 0; i < months; i++) {
            System.out.println("Enter " + i + " th month score: ");
            scores[i] = sc.nextInt();
        }
        // Creating Employee object
        Employee firstEmployee = new Employee(id, workExperience, salary, scores);

        System.out.println("Employee id: " + firstEmployee.id);
        System.out.println("workExperience in years: " + firstEmployee.workExperience);
        System.out.println("monthly salary: " + firstEmployee.salary);

        firstEmployee.bonusEligibility();
        firstEmployee.increment(20);
        firstEmployee.averageScore();
    }
}
