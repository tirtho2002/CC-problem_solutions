public class cc504 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n<=6){
                System.out.println(x);
            }
            else{
                int q=n/6;
                int r=n%6;
                if(r>0){
                int result=(x*q)+x;
                System.out.println(result);
                }
                else{
                    System.out.println((x*q));
                }
                
            }
            
        }

    }
    
}
