package patterns;

public class Pattern8 {  // Diamond pattern
   public void pat8(int n){

    // pyramid
    for(int i = 0; i < n; i++){
        // spaces
        for(int j = 0; j < n-i-1; j++){ // j = n-i when  starts with 1
            System.out.print(" ");
        }

        // stars
        for(int j = 0; j < 2*i+1; j++){
            System.out.print("*");
        }

        // spaces
        for(int j = 0; j < n-i-1; j++){ // j = n-i when  starts with 1
            System.out.print(" ");
        }
        System.out.println();
    }
//----------------------------------------------------
    // inverted pyramid
     for(int i = 0; i < n; i++){
        // spaces
        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
        
        // stars
        for(int j = 0; j < 2*n - (2*i+1); j++){
            System.out.print("*");
        }

        // spaces
        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
        System.out.println();
     }
   }
public static void main(String[] args){
    Pattern8 p = new  Pattern8();
    p.pat8(5);
}

}
