public class BinToDec {
    public static void main(String[] args) {
        binToDec(101);
    }
    public static void binToDec(int binNum){
        int decNum = 0;
        int pow = 0;

        while(binNum > 0){
            int rem = binNum%10;
            decNum = decNum + (rem*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum /10;
        }
        System.out.println(decNum);
    }
}
