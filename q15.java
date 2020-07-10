import java.util.Scanner;
public class Cylinder_area{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double len=sc.nextDouble();
double radius=sc.nextDouble();
double pi=22/7;
double area=radius*radius*pi;
double volume=area*len;
System.out.println("area = "+area+"\nvolume = "+volume);
}
}

