import java.util.Scanner;
import java.io.*;
public class Over_avg{
public static int average(int[] arr){
int avg=0;
int count=0;
for(int i=0;i<arr.length;i++){
avg=avg+arr[i];
count++;
}
avg=avg/count;
return avg;
}
public static double average(double[] arr){
double avg=0.0;
double count=0.0;
for(int i=0;i<arr.length;i++){
avg=avg+arr[i];
count++;
}
avg=avg/count;
return avg;
}
public static void main(String[] args) {
int[] iarr = { 1,2,3,4,5};
double[] darr = { 1.1,2.1,3.5 };
System.out.println(average(iarr));
System.out.println(average(darr));
}
}
