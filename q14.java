import java.util.Scanner;
import java.io.*;
public class Small_ind {
public static int indexOfSmallestElement(double[] arr) {
int index=0;
double min=arr[0];
for(int i=0;i<arr.length;i++) {
if(min>arr[i]) {
min=arr[i];
index=i;
}
}
return index;
}
public static void main(String[] args) {
double[] iarr = {3.4,9.0,1.1,2.5,1.0,4.5};
System.out.println(indexOfSmallestElement(iarr));
}
}

