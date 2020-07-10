import java.util.Scanner;
public class Get_Class{
public static void main(String args[]){
Object obj=new String("tests");
Class val=obj.getClass();
System.out.println("Output :"+val.getName());
}
}
