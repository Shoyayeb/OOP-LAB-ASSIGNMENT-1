public class Employee {
    int id;
    int workExperience;
    double salary;
    int[] score;

    void bonusEligibility() {
        if (workExperience > 10 || salary < 10000) {
            System.out.println("Eligible for bonus");
        } else {
            System.out.println("Not eligible for bonus");
        }
    }
//    FOR 20% INCREMENT ALWAYS->

//    void increment(){
//        double incrementAmount = salary * 0.2;
//        salary += incrementAmount;
//        System.out.println("incremented salary: " + salary);
//    }

    //    FOR INCREMENT BY GIVEN VALUE ->
    void increment(int inc) {
        double incrementAmount = salary * ((double) inc / 100);
        salary += incrementAmount;
        System.out.println("incremented salary: " + salary);
    }

    void averageScore() {
        double totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        double averageScore = totalScore / score.length;
        System.out.println("Average Score= " + averageScore);
    }

    public Employee(int id, int workExperience, double salary, int[] score) {
        this.id = id;
        this.workExperience = workExperience;
        this.salary = salary;
        this.score = score;
    }
}
