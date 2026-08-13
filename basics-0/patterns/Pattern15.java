package patterns;

public class Pattern15 { // inverted char triangle
    public void pat15(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n+1)-i; j++){
                System.out.print((char)(64 + j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern15 p = new Pattern15();
        p.pat15(5);
    }
}
