package Week2;

public class OperatorClass {
    public static void main(String[] args) {
        // Arithmmetic operTOR
        int aNum1=10, aNumn2=20;
        int sum=aNum1+aNumn2; //+ is arithmetic operator
        System.out.println("Addition is"+sum);
        System.out.println("substraction is"+(aNum1-aNumn2));
        System.out.println("multiplication is "+(aNum1*aNumn2));
        System.out.println("Division is"+(aNum1/aNumn2));
        System.out.println("Modulo is"+(aNum1%aNumn2));

        // assignment operatior
        int asNum1 = 20; //assigning value to variable
        asNum1+=1; //same as asNum1=asNum1+1
        System.out.println("+=valie is"+asNum1);
        System.out.println("-=valie is"+(asNum1-=10));
        System.out.println("*=valie is"+(asNum1 *=10));
        System.out.println("/=valie is"+(asNum1/=2));
        System.out.println("%=valie is"+(asNum1%=3));

        // relational operator
        int rNum1=20, rNum2=21;
        boolean rExpression= rNum1 ==rNum2; //returns true or false value
        System.out.println("Equals to "+ rExpression);
        System.out.println("Greater than " +(rNum1>rNum2 ));
        System.out.println("Less than " +(rNum1<rNum2 ));
        System.out.println("Not equals to " +(rNum1!=rNum2 ));
        System.out.println("Greater than equals to " +(rNum1>=rNum2 ));

        //logical operator
        int lNum1=20, lnum2=20;
        boolean lExpression1= lNum1 == lnum2;
        boolean lExpression2= lNum1 == lnum2;
        System.out.println("&& is used for AND" + (lExpression1 && lExpression2));
        System.out.println("|| is used for OR" + (lExpression1 || lExpression2));
        System.out.println("! is used for NOT" + (!lExpression1));
    }
}
