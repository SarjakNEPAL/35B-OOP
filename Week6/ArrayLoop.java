package Week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr =new int[4];
        arr[0]= -10;
        arr[1]=0;   
        arr[2]=10;
        arr[3]=20;
        //we need length of array first, uuse .length
        int arrayLength= arr.length;
        //loop from 0 - (arrayLength -1), 0-3
        for(int index=0; index <arrayLength;index++){
            System.out.println(arr[index]);
        }

        // or we can se condition index <=arrayLength-1
        System.out.println("Decending Loop");
        for(int index= arrayLength -1 ;index >=0; index--){
            System.out.println(arr[index]);
        }

        //lopp the  arr using while loop
        //make an array of ["John","Doe","Foo","Bar"]
        //Make a string "Foo"
        //Loop the array and find in which index is "Foo" on
        //print the index
        String[] words={"John","Doe","Foo","Bar"};
        String istiring="Foo";
        for(int i=0; i<words.length;i++){
            if(words[i]==istiring){
                System.out.println(i);
            }
        }
    }
}
