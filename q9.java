import java.util.Scanner;
import java.io.*;
class Rect{
double length;
double breath;
double height;
Rect(double length,double breath,double height){
this.length=length;
this.breath=breath;
this.height=height;
}
void Display(){
System.out.println("Area of Rectangle ="+ length*breath*height);
}
}
public class Rect_area{
public static void main(String args[]){
Rect r1=new Rect(2.2,1.1,1.1);
r1.Display();
}
}
