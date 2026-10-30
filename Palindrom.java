public class Palindrom {
    public static void isPalindrom(int number){
        int original=number;
        if (number==0) {
            System.out.println(number +" is palindrom");
            return;
        }
        int reverse=0;
        while (number!=0) {
            int digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
        if (original==reverse) {
            System.out.println(reverse+" is palindrome");
        } else {
            System.out.println(reverse + " is not a palindrom");
        }  
    }
    public static void main(String[] args) {
       isPalindrom(12344321);
    }
}
