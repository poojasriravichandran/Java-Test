import java.util.Scanner;
public class Consecutive_number{
public static boolean isConsecutiveFour(int[] arr) {
boolean result = true;
if(arr.length<1)
return false;
int min=getmin(arr);
int max=getmax(arr);
int n=arr.length;
int count=0;
if(max+min-1==n) {
boolean[] reached=new boolean[n];
for(int i=0;i<n;i++) {
if(reached[arr[i]-min]!=false)
return false;
reached[arr[i]-min]=true;
count++;
}
return true;
}
return false;
}
static int getmin(int[] arr) {
int min=arr[0];
for(int i=0;i<arr.length;i++) {
if(min>arr[i]) {
min=arr[i];
}
}
return min;
}
static int getmax(int[] arr) {
int max=arr[0];
for(int i=0;i<arr.length;i++) {
if(max<arr[i]) {
max=arr[i];
}
}
return max;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
for(int i=0;i<num;i++) {
arr[i]=sc.nextInt();	
}
if((isConsecutiveFour(arr)==true))
System.out.println("consecutive");
else
System.out.println("not consecutive");
}
}

