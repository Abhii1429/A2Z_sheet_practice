package patterns;

public class Pattern13 {
    public void pat13(int n){ // number triangle
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern13 p = new Pattern13();
        p.pat13(5);
    }
}
