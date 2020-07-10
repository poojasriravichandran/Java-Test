import java.util.Scanner;
import java.io.*;
public class Small_buffer{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
for(i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
int min=arr[0];
for(i=0;i<arr.length;i++) {
if(min>arr[i]) {
min=arr[i];
}
}
System.out.println("min in an array\n"+min+" ");
}
}

