import java.util.Scanner;
public class String_token{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
