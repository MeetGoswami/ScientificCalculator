import java.util.Scanner;

public class Calculator {
    double getSqrt(int x)
    {
        return Math.sqrt(x);
    }
    long getFact(int x)
    {
        long fact=1;
        for(int i=x;i>0;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    double getLoge(int x)
    {
        return Math.log(x);
    }
    double getPow(int x,int y)
    {
        return Math.pow(x,y);
    }
    public static void main(String args[])
    {
        Scanner sca=new Scanner(System.in);
        int choice;
        Calculator calculator=new Calculator();
        do {
            System.out.println("Scientific Calculator started...");
            System.out.println("1. Find Square Root");
            System.out.println("2. Find Factorial");
            System.out.println("3. Find Natural Logarithm");
            System.out.println("4. Find Power");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice=sca.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the number : ");
                int num=sca.nextInt();
                double sqrt=calculator.getSqrt(num);
                System.out.println("Square root : "+sqrt);
            }
            else if(choice==2)
            {
                System.out.println("Enter the number : ");
                int num=sca.nextInt();
                long fact=calculator.getFact(num);
                System.out.println("Factorial : "+fact);
            }
            else if(choice==3)
            {
                System.out.println("Enter the number : ");
                int num=sca.nextInt();
                double loge=calculator.getLoge(num);
                System.out.println("Natural Logarithm : "+loge);
            }
            else if(choice==4)
            {
                System.out.println("Enter the base : ");
                int base=sca.nextInt();
                System.out.println("Enter the exponent : ");
                int exp=sca.nextInt();
                double power=calculator.getPow(base,exp);
                System.out.println("Power : "+power);
            }
            else if(choice<0 || choice>4)
            {
                System.out.println("INVALID INPUT. PLEASE TRY AGAIN !!");
            }
            else
            {
                System.out.println("Scientific Calculator powered OFF");
            }
        }while(choice!=0);
    }

}
