import java.util.Scanner;
import java.io.*;
public class Mul_buffer{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
int i,odd=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
for(i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++) {
if(arr[i]%2!=0) {
odd=odd*arr[i];
}
}
System.out.println(odd);
}
}
