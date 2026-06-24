package patterns;

public class Pattern5 { // flipped triangle(no. triangle)
    public void pattern5(int n){
        for(int i = 1; i <= n; i++){ // outer loop for rows
            for(int j = 1; j <= n+1-i; j++){  // inner loop for spaces
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Pattern5 p = new Pattern5();
        p.pattern5(5);
    }
}
