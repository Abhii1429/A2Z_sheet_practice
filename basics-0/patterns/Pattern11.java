package patterns;

public class Pattern11 { // combo of st. + inverted triangle
    public void pat11(int n ){
        for(int i = 1; i <= n; i++){
            // st. triangle
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            // inverted pyramid
            for(int j = 1; j <= 2*n - (2*i-1); j++){
                System.out.print(" ");
            }
            // reverse st. triangle
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern11 p = new Pattern11();
        p.pat11(5);
    }
}
