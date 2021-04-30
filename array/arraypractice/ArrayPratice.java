package arraypractice;

import java.util.Arrays;

public class ArrayPratice{
    public static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i<array.length;i++){
            int item = array[i];
            System.out.print(item);
            if(i< array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for(int i = 0; i<array.length;i++){
            String item = array[i];
            System.out.print(item);
            if(i< array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] intArray1 ;
        int[] intArray2 = new int[4];
        intArray2[0]  = 5;
        int[] intArray3 = {1,2,3};
        String[] shoppingList = {"bananas", "apples","pears"};
       
        System.out.println(Arrays.toString(intArray2));
        printArray(intArray3);
        printArray(shoppingList);

        System.out.println("special For Loop");
        for(String S : shoppingList){
            System.out.println(S);
    
        }
       
       
    }
}