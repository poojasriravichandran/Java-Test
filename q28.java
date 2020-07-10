import java.util.Random;
import java.util.Scanner;
public class Random_num{
public static void main(String[] args) {
Random rand=new Random();
for(int i=1;i<3;i++) {
System.out.println(rand.nextInt());
System.out.println(rand.nextDouble());
System.out.println(rand.nextLong());
}
}
}

