import javax.swing.JOptionPane;
import java.util.Random;
public class random{
public static void main(String[] args){
Random random =new Random();
System.out.print("This will be a GUI program so nothing to see in terminal ");
String intro = "In this project my machine will guess a random integer bertween 0 and 50 and you have to guess that number. \n Ps- don't worry i will give you hint ";
JOptionPane.showMessageDialog(null,intro);
int y;
int z;
int x= random.nextInt(51);
//System.out.print(x);
JOptionPane.showMessageDialog(null,"Computer has choosen its number press enetr to play");
int a = Integer.parseInt(JOptionPane.showInputDialog("input your 1st  guess"));
if (x==a){
JOptionPane.showMessageDialog(null, "Great!! In first try only. Your luck is on onother level today dude ");
System.exit(0);
}
else if (x>a){
JOptionPane.showMessageDialog(null, "number "+a+  " is samller than the number that computer choose");
}
else{
JOptionPane.showMessageDialog(null, "number "+a+  " is greater than the number that computer choose");
}
int b=2;
do{
//System.out.print(x);
z=Integer.parseInt(JOptionPane.showInputDialog("Enter your " +b+ " guess"));
if (x>z)
{
JOptionPane.showMessageDialog(null, "number "+z+ " is smaller then the number that computer choose"); 
}
else if(z==x){
JOptionPane.showMessageDialog(null, "Great you gussed the right number " +z);
}
else {
JOptionPane.showMessageDialog(null, "number " +z+ " is biggerr than the number computer choose"); 
}
b++;
}while(z!=x);
}
}
