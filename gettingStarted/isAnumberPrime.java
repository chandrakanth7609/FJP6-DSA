import java.util.*;
  
  public class isAnumberPrime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t=scn.nextInt();      //describes t times input
      for(int j=1;j<=t;j++){      
              int num=scn.nextInt();      //takes single number input 
              int flag=1; 
              for(int i=2;i*i<=num;i++){    //this is optimized one with square root
              //for(int i=2;i<=num/2;i++){  this loop for n/2 numbers we check
              //for(int i=2;i<=num-1;i++){  this loop for checks all numbers from 2 to num
                if(num%i==0){
                  flag=0;
                  break;
                  }
              }
              if(flag==1){
                System.out.println("prime");
              }else{
                System.out.println("not prime");
              }

      }
     }
  }