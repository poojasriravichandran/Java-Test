import java.lang.Math;
import java.util.Random;
import java.io.*;
public class Random_card{
public static void main(String args[]){
Random rand=new Random();
int heart=0;
int spade=0;
int clove=0;
int diamond=0;
heart=rand.nextInt(52);
spade=rand.nextInt(51);
clove=rand.nextInt(50);
diamond=rand.nextInt(49);
if(spade >= heart) {
	spade++;
}
if(clove >= Math.min(heart, spade)) {
	clove++;
}
if(diamond >= Math.max(spade,clove)) {
	diamond++;
}
System.out.println("Heart : "+heart);
System.out.println("Spade : "+spade);
System.out.println("Clove : "+clove);
System.out.println("Diamond : "+diamond);
}
}

