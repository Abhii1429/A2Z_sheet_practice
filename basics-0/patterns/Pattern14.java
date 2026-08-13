package patterns;

public class Pattern14 { // st. chaaracter triangle
    public void pat14(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print((char)(64 + j)+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        Pattern14 p = new Pattern14();
        p.pat14(5);
    }
}
