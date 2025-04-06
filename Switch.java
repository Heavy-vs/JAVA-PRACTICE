import java.util.Scanner;
public class Switch{
public static void main(prac[] args){
int h;
int q;
int m;
int k;
int j;
int x;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the date ");
q= scanner.nextInt();
//Scanner.nextLine();
System.out.println("Enter the month ");
m= scanner.nextInt();
System.out.println("Enter the Year ");
x= scanner.nextInt();
//k= x%100;
//j=x/100;

if(m==1||m==2){
m+=12;
x-=1;
}
k= x%100;
j=x/100;


//System.out.println("Enter the Year ");
//x= scanner.nextInt();
//j= x%100;
h=(q+(13*(m+1))/5+ k + (k/4)+ (j/4) + (5*j))%7;
switch (h){
case 0 :System.out.println("at "+q+ "/"+m+"/"+x+ " the day was Saturday");
break;
case 1 :System.out.println("at "+q+ "/"+m+ "/" +x+ " the day was Sunday");
break;
case 2 :System.out.println("at "+q+ "/" +m+ "/" +x+ " the day was Monday");
break;
case 3 :System.out.println("at "+q+ "/" +m+ "/"+x+ " the day was Tuesday" );
break;
case 4 :System.out.println("at " +q+ "/" +m+ "/"+x+ "the day was Wednesday");
break;
case 5 :System.out.println("at "+q+ "/" +m+ "/" +x+ " the was Thursday");
break;
case 6 :System.out.println("at "+q+ "/" +m+ "/"+x+ " the day was Friday");
break;
default:
System.out.print( "This date does not exist ");
}
}
}




