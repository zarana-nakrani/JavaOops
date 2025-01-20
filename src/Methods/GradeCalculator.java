package Methods;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects you are enrolled in: ");
        int count = input.nextInt();
        int totalMarks = 0;
        for(int i = 0; i < count; i++){
            System.out.print("Enter the marks of subject 1: ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        int percentage = (totalMarks / count * 100) / 100;
        calculateGrade(percentage);
    }

    public static void calculateGrade(int percentage){
        if(percentage > 90) System.out.print("Your Grade is: A+");
        else if(70 <= percentage && percentage <= 89) System.out.print("Your Grade is: A");
        else if(60 <= percentage && percentage <= 69) System.out.print("Your Grade is: B");
        else if(40 <= percentage && percentage <= 59) System.out.print("Your Grade is: C");
        else System.out.println("Your Grade is: D");
    }
}
