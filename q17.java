import java.util.Scanner;
public class Gcd{
public static int gcd(int a,int b) {
if(a==0)
return b;
return gcd(b%a,a);
}
public static int find_gcd(int[] arr,int num) {
int val=arr[0];
for(int i=1;i<arr.length;i++) {
val=gcd(arr[i],val);
if(val==1) {
return 1;
}
}
return val;
}
public static void main(String[] args) {
int arr[]= {11,22,33,10};
int n=arr.length;
System.out.println("gcd is = "+(find_gcd(arr,n)));
}
}

