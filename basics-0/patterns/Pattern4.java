package patterns;

public class Pattern4 {
    public void  pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){ // number triangle
                System.out.print(i); // vertical printing
           }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern4 p = new Pattern4();
        p.pattern4(5);
    }
}
