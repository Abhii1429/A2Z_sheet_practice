package patterns;
public class Pattern3 {
    public void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){ // number triangle
                System.out.print(j); // horizontal printing
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Pattern3 p = new Pattern3();
        p.pattern3(5); // Example call with size 5
    }
}

