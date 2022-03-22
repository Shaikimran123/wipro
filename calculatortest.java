import java.util.*;
class calculatortest{
public static void main(String args[]){
calculator ob=new calculator();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("sum of two numbers :"+ob.getadd(a,b));
System.out.println("difference b/w two numbers :"+ob.getsub(a,b));
System.out.println("multiplication of two numbers :"+ob.getmul(a,b));
System.out.println("division of two numbers :"+ob.getdiv(a,b));
System.out.println("modulo division of two numbers :"+ob.getmoddiv(a,b));

}}

