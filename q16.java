import java.util.Scanner;
public class Vowel_not{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String  str=sc.nextLine();
for(int i=0;i<str.length();i++) {
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
System.out.println("vowel");
}
else {
System.out.println("not vowel");
}
}
}
}

