package patterns;
public class Pattern9 { // st. triangle + inverted triangle
    public void pat9(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < (n-1)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern9 p = new Pattern9();
        p.pat9(4);
    }
}