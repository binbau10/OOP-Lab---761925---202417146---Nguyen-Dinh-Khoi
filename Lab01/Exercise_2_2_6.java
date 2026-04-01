import java.util.Scanner;
import java.lang.Math;
public class Exercise_2_2_6 {
    public static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);
        firstDegreeOneVariableEquation();
        systemOfTwoFirstDegreeTwoVariablesEquations();
        secondDegreeOneVariableEquation();
        keyboard.close();
    }
    public static void firstDegreeOneVariableEquation(){
        System.out.println("Solving equation ax + b = 0");
        System.out.println("Enter variable a:");
        double a = keyboard.nextDouble();
        System.out.println("Enter variable b:");
        double b = keyboard.nextDouble();
        if (a == 0){
            if (b == 0){
                System.out.println("The equation has infinite solutions");
            }
            else{
                System.out.println("The equation has no solutions");
            }
        }
        else{
            System.out.println("The equation has one solution: x = " + (-b/a));
        }

    }
    public static void systemOfTwoFirstDegreeTwoVariablesEquations(){
        System.out.println("Solving system of equations a11x1 + a12x2 = b1, a21x1 + a22x2 = b2");
        System.out.println("Enter variable a11:");
        double a11 = keyboard.nextDouble();
        System.out.println("Enter variable a12:");
        double a12 = keyboard.nextDouble();
        System.out.println("Enter variable b1:");
        double b1 = keyboard.nextDouble();
        System.out.println("Enter variable a21:");
        double a21 = keyboard.nextDouble();
        System.out.println("Enter variable a22:");
        double a22 = keyboard.nextDouble();
        System.out.println("Enter variable b2:");
        double b2 = keyboard.nextDouble();
        
        double d = a11*a22-a12*a21, d1 = b1*a22-b2*a12, d2 = a11*b2-a21*b1;
        if (d == 0){
            if (d1 == 0 && d2 == 0){
                if ((a11 == 0 && a12 == 0 && b1 != 0) || (a21 == 0 && a22 == 0 && b2 != 0)){
                    System.out.println("The equation has no solutions");
                }
                else{
                    System.out.println("The equation has infinite solutions");
                }
            }
            else{
                System.out.println("The equation has no solutions");
            }
        }
        else{
            System.out.println("The equation has one solution: x, y = " + d2/d + ", " + d1/d);
        }
    }
    public static void secondDegreeOneVariableEquation(){
        System.out.println("Solving equation ax^2 + bx + c = 0");
        System.out.println("Enter variable a:");
        double a = keyboard.nextDouble();
        System.out.println("Enter variable b:");
        double b = keyboard.nextDouble();
        System.out.println("Enter variable c:");
        double c = keyboard.nextDouble();
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("The equation has infinite solutions");
                }
                else{
                    System.out.println("The equation has no solutions");
                }
            }
            else{
                System.out.println("The equation has one solution: x = " + (-c/b));
            }
        }
        else{
            double d = b*b-4*a*c;
            if (d < 0){
                System.out.println("The equation has no solutions");
            }
            else if (d == 0){
                System.out.println("The equation has one solution: x = " + (-b/2/a));
            }
            else{
                System.out.println("The equation has two solutions: x = " + ((-b+Math.sqrt(d))/2/a) + ", x = " + ((-b-Math.sqrt(d))/2/a));
            }
        }
    }
}
