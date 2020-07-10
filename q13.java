import java.util.Scanner;
import java.io.*;
public class Commission{
public static double Cal(double amt){
double inst=5.5;
double inst1=10.0;
double com=0.0;
if(amt<=50000.90){
com=amt*(inst/100);
}
else{
com=amt*(inst1/100);
}
return com;
}
public static void main(String args[]){
double amt=460.500;
System.out.println(Cal(amt));
}
}
