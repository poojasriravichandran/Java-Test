import java.util.Scanner;
public class Combination_number{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]= new int[num];
for(int i=0;i<num;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
System.out.println(arr[i]+","+arr[j]);
}
}
}
}
