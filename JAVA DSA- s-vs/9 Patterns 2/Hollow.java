public class Hollow{
    public static void main(String[] args) {
        int rows = 5;
        int cols =  6;
        for(int i=1;i<=rows;i++){
            for(int j = 1;j<=cols;j++){
                if(i==1 || i==rows || j==cols || j==1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}