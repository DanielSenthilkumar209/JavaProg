
import java.util.*;
public class LargestArrayV2{
 
  public static void main(String args[]) {
 
    int arr1[] =  {76,54,34,21,45};
    System.out.println("The Largest element in the array is: "+findLargestElement(arr1));
 
    int arr2[] =  {3,4,67,54,53,42};
    System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
  }
  static int findLargestElement(int arr[]) {
    int max= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max= arr[i];
      }
    }
    return max;
  }
}
