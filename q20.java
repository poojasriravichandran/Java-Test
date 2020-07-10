import java.util.Scanner;
import java.io.*;
public class Sort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
for(int i=0;i<num;i++){
arr[i]=sc.nextInt();
}
int temp=0;
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
System.out.println("Sorted array ");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}

