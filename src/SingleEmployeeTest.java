import java.util.Scanner;

public class SingleEmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        Employee e1 = new Employee(id, workExperience, salary, scores);
        System.out.println("Employee id: " + e1.id);
        System.out.println("workExperience in years: " + e1.workExperience);
        System.out.println("monthly salary: " + e1.salary);
        e1.bonusEligibility();
        e1.increment(20);
        e1.averageScore();
    }
}
