class CountDigit{

    public static void countDigit(int number){
        if (number==0) {
            System.err.println("1");
            return;
        }
    
        int count=0;
        while(number>0 || number<0){
            number=number/10;
            count++;
        }
        System.err.println(count);
    }
    public static void main(String[] args) {
       countDigit(-123);
    }
}