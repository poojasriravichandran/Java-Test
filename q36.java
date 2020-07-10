import java.util.Random;
import java.util.Scanner;
public class Dice_roll{
public static void main(String args[]){
Random rand=new Random();
int dice1=0;
int dice2=0;
int val=0;
int count=0;
for(int i=1;i<=20;i++){
dice1 = (int)(Math.random()*6) + 1;
dice2 = (int)(Math.random()*6) + 1;
val=dice1+dice2;
if(val!=2){
count++;
}
else {
	break;
}
}
System.out.println(count);
}
}


