import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    private final Logger logger= LogManager.getLogger(Calculator.class);
    double getSqrt(int x)
    {
        //logger.info("SQUARE ROOT : "+x);
        logger.info("SQUARE ROOT : "+x);
        double sqrt_ans=Math.sqrt(x);
        //logger.info("RESULT:SQUARE ROOT("+x+") = "+sqrt_ans);
        logger.info("RESULT:SQUARE ROOT("+x+") = "+sqrt_ans);
        return sqrt_ans;
    }
    long getFact(int x)
    {
        logger.info("FACTORIAL : "+x);
        long fact=1;
        for(int i=x;i>0;i--)
        {
            fact=fact*i;
        }
        logger.info("RESULT:FACTORIAL("+x+") = "+fact);
        return fact;
    }
    double getLoge(int x)
    {
        logger.info("NATURAL LOGARITHM : "+x);
        double loge_ans=0;
        try {
            if (x < 0) {
                loge_ans = Double.NaN;
                throw new ArithmeticException("Invalid input : Natural logarithm for negative values in not defined");
            } else {
                loge_ans = Math.log(x);
            }
        }
        catch(ArithmeticException e) {
            System.out.println("[EXCEPTION - LOG]"+e.getLocalizedMessage());


        }
        logger.info("RESULT:NATURAL LOGARITHM("+x+") = "+loge_ans);
        return loge_ans;
    }
    double getPow(int x,int y)
    {
        logger.info("POWER : BASE="+x+" EXPONENT="+y);
        double pow_ans=Math.pow(x,y);
        logger.info("RESULT : POWER("+x+","+y+") = "+pow_ans);
        return Math.pow(x,y);
    }
    public static void main(String args[])
    {
        Scanner sca=new Scanner(System.in);
        int choice;
        Calculator calculator=new Calculator();
        System.out.println("Scientific Calculator started...");
        do {
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
