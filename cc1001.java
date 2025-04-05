public class cc1001 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int man = sc.nextInt();
            int taka = sc.nextInt();
            int tk[] = new int[man];
            for (int j = 0; j < man; j++) {
                tk[j] = sc.nextInt();
            }
            for (int k = 0; k < man; k++) {
                if (taka < tk[k]) {
                    System.out.print(0);
                    continue;
                } else {
                    taka -= tk[k];
                    System.out.print(1);
                }

            }
            System.out.println("");


        }
    }

}
