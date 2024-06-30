package Week12;

public class ExceptionHandlingTask {
    public static void main(String[] args) {
        // Task
        // Find the exception and use try catch block finally accordingly
        int number1 = 10;
        int number2 = number1 - 10;
        try{int number3 = number1 / number2;}
        catch(ArithmeticException e){System.out.println("Cannot divide by zero");}
        String name= null;
        // System.out.println(name.length());
        try{
            System.out.println(name.length());}
        catch(NullPointerException e){
            System.out.println("It is null");
        }
        
        String[] names = new String[100];
        names[0] = "Ram";
        try{
        names[110] = "Shyam";
        }catch(IndexOutOfBoundsException e){
            System.out.println("Array is out of bound");
        }
        //  Task end
    }
}
