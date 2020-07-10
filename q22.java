import java.util.Scanner;
public class Divide_by{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int val=sc.nextInt();
if((val%5==0)&&(val%6==0)) {
System.out.println(val+" is divisible by both 5 and 6");
}
else if((val%5==0)||(val%6==0)) {
System.out.println(val+" is divisible by 5 or 6, but not both");
}
else {
System.out.println(val+" not divisible by both the 5 & 6");
}
}
}
