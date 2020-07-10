import java.util.Scanner;
public class Finalize_Method {
public static void main(String[] args) {
Finalize_Method obj1=new Finalize_Method();
Finalize_Method obj2=new Finalize_Method();
obj1=null;
obj2=null;
System.gc();
}
protected void finalize() throws Throwable{
System.out.println("finalize : "+this);
}
}
