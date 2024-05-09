package Week5;

public class StaticFunction {
    public static int multiply(int a,int b){
        int multiplication =a*b;
        return multiplication;
    }
    public static void main(String[] args) {
        /*if the funtion is static and in same class
         * no need to make object simply call
         */
        int multiplyReturn = multiply(10,2);
        System.out.println("Return is "+multiplyReturn);
    }
}
