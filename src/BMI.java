/**
 * @class: BMI
 * @author: Nazmun Nahar
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 9, 2023
 * description: this program will calculate BMI index and interpret the BMI
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Enter weight in pounds: ");
        weight = prompt.nextDouble();
        System.out.print("Enter height in inches: ");
        height = prompt.nextDouble();

        weight = weight * 0.4536;
        height = height * 0.0254;

        bmi = weight/(height*height);
        System.out.println("BMI is: " + bmi);

        if(bmi >= 30.0)
            System.out.println("BMI interpretation: Obese");
        else if (bmi >= 25)
            System.out.println("BMI interpretation: Overweight");
        else if (bmi >= 18.5)
            System.out.println("BMI interpretation: Normal");
        else
            System.out.println("BMI interpretation: Underweight");
    }
}
