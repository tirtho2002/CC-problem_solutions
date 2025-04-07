import java.util.Scanner;

class Diet {
    int N, K;

    public Diet(int N, int K, int[] arr) {
        this.N = N;
        this.K = K;

        int extra = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] >= K) {
                extra += (arr[i] - K);
            } else {
                int required=K-arr[i];
                if(extra>=required){
                    extra -=required;
                }
                else{
                    System.out.println("NO "+(i+1));
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}

public class cc1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Diet dd=new Diet(n, k, arr);

        }
    

        sc.close();
    }
}
