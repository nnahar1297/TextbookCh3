/**
 * @class: Triangle
 * @author: Nazmun Nahar
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 9, 2023
 * description: this program will calculate the perimeter of a triangle
 */

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c; //Edges of the triangle
        int p;

        System.out.println("Enter the edges: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a+b>c && b+c>a && a+c>b){
            p = a+b+c;
            System.out.println("The input is valid and the perimeter is: " + p);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
