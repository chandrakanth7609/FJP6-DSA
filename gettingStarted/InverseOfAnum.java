
import java.util.*;

public class InverseOfAnum{

public static void main(String[] args) {
  Scanner scn=new Scanner(System.in);
  int num=scn.nextInt();
  int position=1;
  int sum=0;
  while(num!=0){
    int digit=num%10;
    int value=position*(int)(Math.pow(10,digit-1));
    sum=sum+value;
    position++;
    num=num/10;
    //position++;


  }
  System.out.println(sum);

 }
}