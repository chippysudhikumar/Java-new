import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
//star printing
        System.out.println("enter your number");
        int number=myObj.nextInt();
        for(int i=1;i<=number;i++){
            String s="";
            for(int j=1;j<=i;j++){
                s+="*";
            }
            System.out.println(s);
        }


        //MULTIPLICATION TABLE
//        System.out.println("enter your number");
//        int number=myObj.nextInt();
//        System.out.println("enter your limit");
//        int limit=myObj.nextInt();
//        for(int i=0;i<=limit;i++){
//            int answer=number*i;
//            System.out.println(number+"x"+i+"="+answer);
//        }




        //RADIUS
//        double pi=3.14;
//        System.out.println("enter your number");
//        double number=myObj.nextDouble();
//        System.out.println(pi*number*number);
    }
}


