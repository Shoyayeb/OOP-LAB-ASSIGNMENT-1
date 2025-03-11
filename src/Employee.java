public class Employee {
    int id;
    int workExperience;
    double salary;
    int[] score;

    // Method to check bonus eligibility
    void bonusEligibility() {
        if (workExperience > 10 || salary < 10000) {
            System.out.println("Eligible for bonus");
        } else {
            System.out.println("Not eligible for bonus");
        }
    }

    // Method to apply salary increment
    void increment(int inc) {
        salary *= (1 + (double) inc / 100);
        System.out.println("incremented salary: " + salary);
    }

    // Method to calculate and print average score
    void averageScore() {
        double totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        double averageScore = totalScore / score.length;
        System.out.println("Average Score= " + averageScore);
    }

    // Constructor to initialize Employee details
    public Employee(int id, int workExperience, double salary, int[] score) {
        this.id = id;
        this.workExperience = workExperience;
        this.salary = salary;
        this.score = score;
    }
}
