import java.util.Scanner;
public class Main {
  static void myMethod(int number) {
      float average;
      int sumOFNumbers =0;
    
      int count= 0;
      for(int i= 2;  i<number; i++){
          int counter =0;
          for (int j =1; j<=i; j++){
              if(i%j==0){
                  counter++;
              }
          }
          if(counter == 2){
              count++;
              sumOFNumbers = sumOFNumbers + i;
          }
    
         }
          
         
      average = (float)sumOFNumbers/count;
    
    System.out.println("Your Average score is: "+ average);
  }

  public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
      System.out.print("enter a number:  ");
      int number =scan.nextInt();
     
      
    myMethod(number);
  }
}
