package patterns;

public class Pattern7 {
    public void pat7(int n){ // inverted pyramid pattern
      for(int i = 0; i < n; i++){
        //spaces
        for(int j = 0; j < i; j++){
          System.out.print(" ");
        }

        // stars
        for(int k = 0; k < 2*n - (2*i + 1); k++){
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
   Pattern7 p = new Pattern7();
   p.pat7(5);
 }
}
