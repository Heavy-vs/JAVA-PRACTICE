public class expection {
    public static void main(String[] args) throws InterruptedExceptioncd {
        // int [] x = {1,2,3,4,5,6};
        // try{
        //     System.out.println(x[9]);
        // } catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("high number");
        // }
        // finally {
        //     System.out.println("not found finished checking array");
        // }
        // another one 
//             String x  = "abc";
//             try{
//                 // int y = Integer.parseInt(x);
//                 System.out.println(Integer.parseInt(x));
//             }catch(NumberFormatException e ){
//                 System.out.println("Invaild number");
//             }
//             finally{
//                 System.out.println("finshed parsing string");
//             }
//         System.out.println("Start");
//         Thread.sleep(2000);  // Waits for 2 seconds
//         System.out.println("End");
//         int age = 19;
//         if (age < 18) {
//         throw new ArithmeticException("Not allowed to vote");
//         } else {
//         System.out.println("You can vote!");
// }
            int age = 15;
            try {
                check(age);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            }
 
    
     static void check(int age) throws InterruptedException {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        } else {
            System.out.println("You can vote");
        }
     }
}
