import java.util.Scanner;
public class Avg_neg{
public static void main(String args[]){
int [] arr = {23,45,67,10,20,-2,34,66,57};
int i;
double avg=0.0;
int count=0,count1=0,count2=0;
int size=0;
for(i=0;i<arr.length;i++) {
if(arr[i]>0) {
avg=avg+arr[i];
count2++;
}
}
avg=avg/(count2);
System.out.print(avg+"\n");
for(i=0;i<arr.length;i++) {
if(arr[i]>avg) {
count++;
}
else if(arr[i]<avg) {
count1++;
}
}
System.out.println(count);
System.out.println(count1);

}
}
