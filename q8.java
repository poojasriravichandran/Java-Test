import java.io.*;
import java.util.Scanner;
public class Sqr_cube{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int dig=0,sqr=0,cube=0;
while(num!=0) {
dig=num%10;
num=num/10;
sqr=dig*dig;
cube=sqr*dig;
System.out.println("square = "+sqr+" cube = "+cube);
}
}
}
