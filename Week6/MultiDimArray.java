package Week6;

public class MultiDimArray {
    public static void main(String[] args) {
        int[] oneDArray; // one dimentional array
        int[][] twoDArray;//two dimentional array
        int[][][] threeDArray;//three dimentional array
        //memory allocaion,, must give size to each dimention
        twoDArray=new int [2][3];
        twoDArray[0][0]=10;
        twoDArray[0][1]=10;
        twoDArray[1][0]=10;
        twoDArray[1][2]=10;
        //access in variable
        int arrayElement = twoDArray[0][0];
        System.out.println(arrayElement);
        System.out.println(twoDArray[0][1]);
    }
}