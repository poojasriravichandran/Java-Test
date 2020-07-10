import java.util.Scanner;
public class Bank{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
double amt=sc.nextDouble();
double amt_int;
if(amt<=1000.0){
amt_int=amt*(4/100);
}
else if(amt>1000&&amt<=5000.0){
amt_int=amt*(4.5/100);
}
else{
amt_int=amt*(5/100);
}
System.out.println((int)amt_int);
}
}
