import java.util.Scanner;
public class Rest_disp{
int room_num;
String room_type;
double room_area;
String ac;
void Setdata(int r_n,String r_t,double r_a,String a){
room_num=r_n;
room_type=r_t;
room_area=r_a;
ac=a;
}
void Displaydata(){
System.out.println(room_num+" "+room_type+" "+room_area+" "+a);
}
public static void main(String args[]){
Rest_disp r1=new Rest_disp();
r1.room_num=101;
r1.room_type="Single";
r1.room_area=23.8;
r1.ac="Yes";
r1.Displaydata();
}
}
