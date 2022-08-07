public class Main {
  static void myMethod(int number) {
      int average;
      int sumOFNumbers =0;
    
      int count= 0;
      for(int i= 1;  i<=number; i++){
          if(i%2== 0){
              sumOFNumbers =sumOFNumbers + i;
              count++;
          }
      }
      average = sumOFNumbers/count;
    
    System.out.println(average);
  }

  public static void main(String[] args) {
    myMethod(10000);
  }
}
