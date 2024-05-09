package Week5;

import java.util.Scanner;

public class StaticFunctionTask {
    /*Task 1 
     * create a function checkEligible
     * takes 2 parameter, string name, int age
     * returns String
     * if age is less than 0, more than 200 return "Hello name. Invalid age"
     * if age is less than 18, return "Sorry you are not eligible"
     * else return "Congratulations name, you are eligible"
     */
    public static void checkEligible(int age,String name){
        if (age<18 && age>0 ) {
            System.out.println("Sorry "+name+", You are not eligible");          
        }
        else if (age>18 && age<200) {
            System.out.println("Hello "+ name + ", You are eligible");
        }
        else{
            System.out.println("Hell0 "+ name+", Invalid age");
        }
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age");
        int age=scan.nextInt();
        System.out.println("Enter name ");
        String name=scan.nextLine();
        checkEligible(age, name);
        scan.close();
    }
    }

