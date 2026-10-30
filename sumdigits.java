public class sumdigits {

    public static void sumdigi(int number){
        int sum=0;
        if (number==0) {
            System.out.println("Sum= 0");
            return;
        }
        while(number<0 || number>0){
            int digit=number%10;
            sum+=digit;
            number=number/10;
        }
        System.out.println("Sum= "+sum);
    }
    public static void main(String[] args) {
        sumdigi(508);
    }    
}
