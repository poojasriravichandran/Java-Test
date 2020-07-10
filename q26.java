import java.util.Scanner;
public class String_typ{
public static void main(String args[]){
String str="envelope book";
System.out.println(str.replace('e','a'));
System.out.println(str.replaceFirst("envelope","Cover"));
System.out.println(str.replaceAll("envelope","book"));
System.out.println(str.contains("u"));
System.out.println(str.substring(1,2));
System.out.println(str.concat("execution"));
System.out.println(str.charAt(9));
}
}
