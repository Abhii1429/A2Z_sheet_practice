package patterns;

public class Pattern6 { // pyramid pattern
    public void pattern6(int n){
        for(int i = 0; i < n; i++){ // outer loop for rows
            // spaces
            for(int j = 0; j <= n-i-1; j++){ // inner loop for spaces
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++){ // inner loop for stars
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        Pattern6 p = new Pattern6();
        p.pattern6(5);
    }
}
