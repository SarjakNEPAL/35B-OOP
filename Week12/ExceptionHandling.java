package Week12;
import java.lang.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program start");
        int num=1;
        try{
        int num2=10/0; // arithmitic exception - exists here
        }catch(ArithmeticException ex){
            System.out.println("CANNOT DIVIDE BY ZERO" );
        }
        finally{
            System.out.println("Finully runs whether exception occurs or not");
        }
        System.out.println("Program end");
        // note : catch and finally are optional,but,either or both should be present after try 
        int[] numA =new int[5];
        numA[0] =100;
        try{

        numA[100]=1000; // ArrayIndexOutOfBoundsException-exists here;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array is not long enough");
        }
        // any object can be assigned value of null
        String data = null;
        // try{
        // System.out.println(data.length());//null pointer exception
        // }
        // catch(NullPointerException ex){
        //     System.out.println("Null value");
        // }
        //multileveled exception
        try{
            int numMulti = 10000/0; // arithmetic exception
            String d2 = null;
            System.out.println(d2.length());

        }catch(ArithmeticException ex){
            System.out.println("Number error");
        }
        catch(Exception ex){
            System.out.println("Null aayo");
        }
        finally{
            System.out.println("try end");
        }
        //exception  
        try{
            int num3=10/10;
            int[] numArr2=new int[100];
            numArr2[10000]=10;
        }        catch(Exception ex){
            System.out.println("I catch all exceptions");
        }
        // note id toy dont know what kind of exception your code throws
        //uses exception
        // throw manually throw exception
        throwExample();
        System.out.println("Program end");
        
        
    }
    static void throwExample(){
        throw new ArithmeticException("Where is the numnber?");
    }
    static void checkTry()  throws Exception{
        System.out.println("When running hthis funtion wrap around try catch");
    }
    

}
