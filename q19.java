import java.lang.Math;
import java.util.Random;
import java.io.*;
public class Random_headtail{
public static void main(String args[]){
Random rand=new Random();
int head=0;
int tail=0;
for(int i=0;i<520;i++){
if(rand.nextBoolean()){
head++;
}
}
tail=500-head;
System.out.println("Heads ="+head);
System.out.println("Tails ="+tail);
}
}

