public class ReverseNum {
    public static void isReverse(int number){
        if (number==0) {
            System.out.println("Reversed number is "+number);
            return;
        }
        int reverse=0;
        while (number!=0) {
            int digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
        System.out.println("Revrsed number is "+reverse);
    }
    public static void main(String[] args) {
        isReverse(12345);
    }
}
