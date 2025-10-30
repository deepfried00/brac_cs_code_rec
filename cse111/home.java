import java.util.*;

public class home{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {23,100,0,56,-34};
    int n = sc.nextInt();
    boolean found = false;
    for(int i = 0; i< arr.length; i++){
      if(arr[i] == n) {
        found = true;
        System.out.println("found");
        break;
      }
    }
    int[] arr2 = new int[arr.length - 1];
    if(found == true) {
      int count = 0;
      for(int i =0; i < arr.length; i++) {
        if(arr[i] == n) {
          continue;
        }
        else if(count < arr2.length) {
          arr2[count] = arr[i];
          count++;
        }
        else {
          break;
        }
      }
    }
          else{
        System.out.println("not found");
      }
          System.out.println(Arrays.toString(arr2));
  }
}
      