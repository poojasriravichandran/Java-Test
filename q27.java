import java.util.Scanner;
public class Diagonal{
public static int sumMajorDiagonal(int[][] m) {
int sum=0;
for(int row=1;row<m.length;row++) {
for(int col=1;col<m.length;col++) {
if(row==col) {
sum=sum+m[row][col];
}
}
}
return sum;
}
public static void main(String[] args) {
int arr[][]= {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
System.out.println(sumMajorDiagonal(arr));
}
}

