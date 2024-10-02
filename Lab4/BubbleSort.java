package Lab4; // comment out later

import java.util.*;
import java.util.stream.IntStream;

//TODO
 //prompt the user to enter the value of n
 //create an integer array of size n with random integers
 //the range of random integers is from 1 to n


public class BubbleSort{
 public static void main(String[] args){
 
    Scanner in = new Scanner(System.in);

    while(true){
    System.out.print("Input Array Size: ");
    int n = in.nextInt(); // n array size

    // randomized array 0 - n
    int[]  randomArr = IntStream.generate(() -> new Random().nextInt(n)).limit(n-1).toArray();


    // no sort
    System.out.print("Non-Sorted Array: "); // test
    System.out.print(Arrays.toString(randomArr)); // test
    System.out.println(" ");

    // sort
    sort(randomArr); // call sort method

    System.out.print("Sorted Array: "); // test
    for(int i=0; i < randomArr.length; i++)
{
    System.out.print(randomArr[i] + " ");
}
    System.out.println(" ");
    


    System.out.println(" ");
    //for (int[] print : sort.(randomArr[])){

    //}
    }

 //long startTime, endTime, executionTime;
 //startTime = System.currentTimeMillis();
 //call to the sort method
 //endTime = System.currentTimeMillis();
 //executionTime = endTime - startTime;
//display the executionTIme

}
 public static int[] sort(int[] arr){

   boolean didSwap;
   int temp = 0;

 for (int k = 1; k < arr.length; k++) {
    didSwap = false;
  
   
    for (int i = 0; i < arr.length - k; i++) {
        if (arr[i] > arr[i + 1]) {

             // Swap arr[j] and arr[j+1]
             temp = arr[k];
             arr[k] = arr[k + 1];
             arr[k + 1] = temp;
             didSwap = true;

    }
    }
 
    

   }
   return arr;
 }
}