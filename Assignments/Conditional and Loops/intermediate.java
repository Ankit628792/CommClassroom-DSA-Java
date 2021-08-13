
import java.util.Scanner;
import java.lang.*;

public class Intermediate{

    static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result=1;
        for(int i=1; i<=num; i++)
            result *=i;
        System.out.println("The factorial of "+ num + " is: "+ result);
    }

    static void bill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit consumed: ");
        float num = sc.nextFloat();
        System.out.println("Your electricity bill is: Rs." + num*4.2);
    }

    static void averageNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to find average: ");
        int n = sc.nextInt();
        int i = n;
        float sum=0;
        System.out.println("Start entering numbers");
        while(i>0){
            sum = sum + sc.nextFloat();
            i--;
        }
        System.out.println("The average of the numbers is: "+ (sum/n));
    }

    static void discount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many products you have product?  ");
        int n = sc.nextInt();
        float sum=0, discount=0;
        while(n>0){
            float price = sc.nextFloat();
            sum+=price;
            if(price <=500){
                System.out.println("No discount on this product" );
            }
            else if(price>500 && price <=1000){
                System.out.println("Discount on this product is: " + price*0.15 );
                discount += (price*0.15);
            }
            else{
                System.out.println("Discount on this product is: " + price*0.3 );
                discount += (price*0.3);
            }
            n--;
        }
        System.out.println("the overall discount is: " + discount);
        System.out.println("You have to pay the amount: " + (sum-discount));
    }

    static void distance(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter point 1: ");
        float p1 = sc.nextFloat();
        System.out.print("Enter point 2: ");
        float p2 = sc.nextFloat();
        System.out.println("The distance between "+p1 +" and "+p2+" is: "+ (Math.sqrt(p1*p1 +p2*p2)));
    }

    static void commission(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int num = sc.nextInt();
        if(num <= 1000)
        System.out.println("The commission is: " + (num*0));
        else if(num > 10000 && num<=100000)
        System.out.println("The commission is: " + (num*0.1));
        else if(num > 100000 && num<=1000000)
        System.out.println("The commission is: " + (num*0.2));
        else if(num > 1000000 && num<=10000000)
        System.out.println("The commission is: " + (num*0.35));
        else
        System.out.println("50% Partnership");
    }

    static void power(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and power: ");
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int result=1;
        while (pow>0){
            result*=num;
            pow--;
        }
        System.out.println("The ans is: "+ result);
    }

    static void batting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of matches: ");
        int match = sc.nextInt();
        int i=1,sum=0, runs, inn;
        float average=0;

        while(i<=match){
            System.out.print("Enter total runs in match "+ i + " : ");
            runs = sc.nextInt();
            System.out.print("Enter total innings: ");
            inn = sc.nextInt();
            average =  runs/inn;
            sum+=average;
            System.out.println("Average batting of match "+ i +" is: "+ average);
            i++;
        }

        System.out.println("The average batting of series is: "+ (sum/match));
    }

        static void cgpa(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter total marks obtained: ");
            int marks = sc.nextInt();
            if(marks <= 100 && marks>=0){
                System.out.println("Your CGPA is: "+ (float)(marks/9.5));
            }
            else{
                System.out.println("Invalid marks");
            }
        }

        // CI, a= p(1+r/n)^nt 
        // p = initial pricipal balance
        // r = interest rate 
        // n = no of time interest applied
        // t = no of times periods applied
        static void compoundInterest(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter principal amount: ");
            float p = sc.nextFloat();
            System.out.print("Enter interest: ");
            float r = sc.nextFloat();
            System.out.print("Enter how many times interest applied: ");
            float n = sc.nextFloat();
            System.out.print("Enter time period: ");
            float t = sc.nextFloat();

            double a = p * Math.pow((1+(r/100)/n), (n*t)) - p;

            System.out.println("The compound interest is: "+ a);
        }

        static void averageMarks(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Total no of subjects: ");
            int n = sc.nextInt();
            int i = n;
            float sum=0;
            System.out.println("Start entering marks for subjects");
            while(i>0){
                sum = sum + sc.nextFloat();
                i--;
            }
            System.out.println("The average of the marks is: "+ (sum/n));
        }

        static void addition(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Two Numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("The sum is: "+ (n1+2));
        }

        static void sumOfN(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Start typing numbers and 0 for exit: ");
            int n=1,sum=0;
            while(n!=0){
                n = sc.nextInt();
                sum+=n;
            }
            System.out.println("The sum is: "+sum);
        }

        static void armstrong(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            int r, result=0, n=num;
            while(n !=0){
                r=n%10;
                result+=(r*r);
                n/=10;
            }
            if(result == num)
                System.out.println("It's a armstrong number");
            else
                System.out.println("It's not a armstrong number");
        }

        static int fact(int n){
            int result=1;
            for(int i=1; i<=n; i++)
                result *=i;
            return result;
        }
        static void cAndP(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of n and r: ");
            int n = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("The Permutation is: "+ (fact(n)/fact(r)));
            System.out.println("The Combination is: "+ (fact(n)/(fact(r) * fact(n-r))));
        }

        static void reveseString(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String newStr="";
            for(int i=0; i<str.length(); i++){
                newStr+=str.charAt(str.length() - i - 1);
            }
            System.out.println("The reversed string is: " + newStr);
        }

        static void palindrome(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String newStr="";
            for(int i=0; i<str.length(); i++){
                newStr+=str.charAt(str.length() - i - 1);
            }
            if(str.equals(newStr)){
                System.out.println("It's a palindrome");
            }else{
                System.out.println("It's not a palindrome");
            }
        }

        static void hcf(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Two Numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int mx = Math.max(n1,n2);
            int i=1, hcf=0;
            while(i <= mx){
                if(n1%i == 0 && n2%i == 0){
                    hcf=i;
                }
                i++;
            }            
            System.out.println("The HCF is: "+ hcf);
        }

    public static void main(String args[]){
        // Enter the name of program you want to run
    }
}