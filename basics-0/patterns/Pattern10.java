package patterns;

public class Pattern10 { // 0 & 1 triangle
    public void pat10(int n){
  
    for(int i = 0; i < n; i++){
     for(int j = 0; j < i; j++){
        if((i+j) % 2 == 0){
            System.out.print(0);
        } else{
            System.out.print(1);
        }
     }
        System.out.println();
     }
    }
    public static void main(String[] args){
        Pattern10 p = new Pattern10();
        p.pat10(6);
    }
}
