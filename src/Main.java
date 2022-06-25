import java.util.Scanner;

public class Main {
//     Largest number of three
    public static void LargestNum() {
        System.out.println("enter the 3 numbers : ");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int max = num1;
            if(num2>max){
                max = num2;
            }
            if (num3>max){
                max = num3;
            }
            System.out.println("largest number is " + max);
        }
//     Entered alphabet is lower or upper case
    public static void AlphabetCaseCheck() {
        System.out.println("Enter the letter:");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().trim().charAt(0);
            if (ch>='a'&&ch<='z'){
                System.out.println("Lowercase");
            }else System.out.println("Uppercase");


        }
//    Fibonacci series
    public static void Fibonacci() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            for (int i = 2;i<=n;i++ ){
                int temp = b;
                b = b+a;
                a = temp;
                System.out.print(b + " ");
            }
//            System.out.println(b);
        }
//    How many times a digit has occurred
    public static void NumOccurrence() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number: ");
            int num = sc.nextInt();
            System.out.println("enter the digit: ");
            int digit = sc.nextInt();
            int count = 0;
            int temp = num;
            while (num>0){
                int rem = (num%10);
                if (rem==digit){
                    count++;
                }
                num/=10;
            }
            System.out.println("the digit " + digit + " has occurred "+count + " times in " + temp);
        }
//        Reverse of a number
    public static void Reverse() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            int ans = 0;
            int temp = num;
            while (num>0){
                int rem = (num%10);
                ans = (ans*10) + rem;
                num/=10;
            }
            System.out.println("the reverse of " + temp + " is " + ans);
        }
//    If the number is prime
    public static void isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        if (n<=1){
            System.out.println("Not Prime!");
            return;
        }
        int c = 2;
        while (c*c<=n){
            if (n%c==0){
                System.out.println("Not Prime!");
                return;
            }c++;
        }
        System.out.println("Is Prime!");
    }
//     armstrong numbers
    public static void Armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int og = n;
        int sum = 0;
        while (n>0){
            int r = (n%10);
            sum += r*r*r;
            n = (n/10);
        }
        if (sum==og){
            System.out.println("Is An Armstrong Number!");
        }
        else System.out.println("Not An Armstrong Number!");
    }
//        Main Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<------------------->");
        System.out.println("LOT >> Largest number of three");
        System.out.println("ACC >> Entered alphabet is lower or upper case");
        System.out.println("FIB >> Fibonacci series");
        System.out.println("DOC >> How many times a digit has occurred ");
        System.out.println("REV >> Reverse of a number");
        System.out.println("PRI >> If the number is prime");
        System.out.println("ARM >> If the number entered is Armstrong number");
        System.out.println("<------------------->");
        String game = sc.next();
        switch (game) {
            case "LOT" -> LargestNum();
            case "ACC" -> AlphabetCaseCheck();
            case "FIB" -> Fibonacci();
            case "DOC" -> NumOccurrence();
            case "REV" -> Reverse();
            case "PRI" -> isPrime();
            case "ARM" -> Armstrong();
            default -> System.out.println("Please enter a valid field");
        }
    }
    }


