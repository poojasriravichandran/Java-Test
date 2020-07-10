import java.util.Scanner;
public class Rev{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
int arr[]=new int[num];
for(int i=0;i<=num;i++){
arr[i]=sc.nextInt();
count++;
if(arr[i]==0){
break;
}
else{
continue;
}
}
for(int j=count;j>=0;j--){
System.out.println(arr[j]);
}
}
}

