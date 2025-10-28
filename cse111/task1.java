import java.util.*;

public class task1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nstart = sc.nextInt();
    int nend = sc.nextInt();
    int start = 0;
    int end = 0;
    if( nstart > nend ) {
      start = nend;
      end = nstart;
    }
    else {
      start = nstart;
      end = nend;
    }
    int prime_number = 0;
    for(int number = start; number <= end; number++){
          int count = 0;
      for(int i =1 ;  i <= number; i++){
        if( number % i == 0) {
          count++;
        }
      }
      if( count == 2) {
        prime_number++;
      }
    } 
    System.out.println("There are "+ prime_number + " prime numbers between" + " " + start +" " + end +".");
  }
}
