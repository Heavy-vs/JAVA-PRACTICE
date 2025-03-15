//x^2 -4x +3=0
import javax.swing.JOptionPane;
public class equation{
public static void main(String[] args){
System.out.print("this will be GUI based and will slove your polynomial equation");
double a = Double.parseDouble(JOptionPane.showInputDialog("enter the coffient of x^2"));
double b = Double.parseDouble(JOptionPane.showInputDialog("enter the coffient of x"));
double c = Double.parseDouble(JOptionPane.showInputDialog("enter the number without variable"));
double x;
double y;
double z;
x = Math.sqrt(b*b -4*a*c);
z= (-b + x)/2*a;
y= (-b -x)/2*a;
JOptionPane.showMessageDialog(null, "one root is "+z+ " second root is "+y);
}
}
