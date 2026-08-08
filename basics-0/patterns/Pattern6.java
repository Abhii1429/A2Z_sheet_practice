package patterns;

public class Pattern6 { // pyramid pattern
    public void pattern6(int n){
    //     for(int i = 0; i < n; i++){ // outer loop for rows
    //         // spaces
    //         for(int j = 0; j <= n-i-1; j++){ // inner loop for spaces
    //             System.out.print(" ");
    //         }
    //         for(int k = 0; k < 2*i+1; k++){ // inner loop for stars
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // 2nd approach
    for(int i = 1; i <= n; i++){
        // spaces
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        // stars
        for(int k = 1; k <= 2*i-1; k++){
            System.out.print("*");
        }
        // spaces
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}  
    public static void main(String[]args){
        Pattern6 p = new Pattern6();
        p.pattern6(4);
    }
}
