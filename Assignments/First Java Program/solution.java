import java.util.Scanner; 
class Solution{  

    public static void factorial(){
        System.out.print("Enter a number to get factorial : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result=a;
        for(int i=1; i<a; i++){
            result = result * i;
        }
        System.out.println("Factorial of the given no is: " + result);
    }  

    public static void oddEven(){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0)
            System.out.println("Number " + a + " is even");
        else
            System.out.println("Number " + a + " is odd") ;
    }

    public static void greet(){
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome to java programming");
    }

    public static void simpleInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        float p = sc.nextFloat();
        System.out.print("Enter time (in year) : ");
        float t = sc.nextFloat();
        System.out.print("Enter rate of interest : ");
        float r = sc.nextFloat();
        double amount = p*t*(r/100);
        System.out.println("Simple Interest is : " + amount);
    }

    public static void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter num2 : ");
        float num2 = sc.nextFloat();
        System.out.print("Enter Operator : ");
        char op = sc.next().charAt(0);

        double result;

        switch(op){
            case '+':
                result = num1 + num2 ;
                break;
            case '-':
                result = num1 - num2 ;
                break;
            case '/':
                result = num1 / num2 ;
                break;
            case '*':
                result = num1 * num2 ;
                break;
            case '%':
                result = num1 % num2 ;
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("The calculated result is: " + result);
    }

    public static void compareNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter num2 : ");
        float num2 = sc.nextFloat();

        if(num1 > num2){
            System.out.println("Num1 is greater");
        }
        else if(num1 < num2){
            System.out.println("Num2 is greater");
        }
        else{
            System.out.println("Both num1 and num2 are equal");
        }
    }

    public static void factor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            if(num % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static void currencyConverter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Currency in Rupees : ");
        float num = sc.nextFloat();
        System.out.println("Currency in doller is : " + num*73.4);
    }

    public static void sumOfAllNumbers(){
        Scanner sc = new Scanner(System.in);
        int num=1,sum=0;
        while(num != 0){
        System.out.print("Enter num or 0 to exit : ");
        num = sc.nextInt();
        sum=sum+num;
        }
        System.out.println("The sum is : "+ sum);
    }

    public static void largestNum(){
        Scanner sc = new Scanner(System.in);
        int num=1,largest=0;
        while(num != 0){
        System.out.print("Enter num or 0 to exit : ");
        num = sc.nextInt();
        if(largest< num){
            largest = num;
        } 
        }
        System.out.println("The largest number is : "+ largest);
    }

    public static void main(String args[]){ 
        //Call the function that you want to run
    }
}  
