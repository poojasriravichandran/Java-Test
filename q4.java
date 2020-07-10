import java.util.Scanner;
public class Leap{

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long year=sc.nextLong();
if (year % 4 == 0) {
if (year % 100 == 0) {
if (year % 400 == 0)
System.out.println("leap year");
else
System.out.println("not a leap year");
} 
else
System.out.println("leap year");
} 
else
System.out.println("not a leap year");
}
}

