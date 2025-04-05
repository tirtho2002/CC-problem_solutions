public class cc1006 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr1 = new int[3];
            int arr2[] = new int[3];
            for (int k = 0; k < 3; k++) {
                arr1[k] = sc.nextInt();
            }
            for (int k = 0; k < 3; k++) {
                arr2[k] = sc.nextInt();
            }

            int sum1 = arr1[0] + arr1[1] + arr1[2];
            int sum2 = arr2[0] + arr2[1] + arr2[2];
            if (sum1 > sum2) {
                System.out.println("DRAGON");
            } else if (sum2 > sum1) {
                System.out.println("SLOTH");
            } else if (arr1[0] == arr2[0] && arr1[1] == arr2[1] && arr1[2] == arr2[2]) {
                System.out.println("TIE");
            } else {
                for (int k = 0; k < 3; k++) {
                    if (arr1[k] == arr2[k]) {
                        continue;

                    }

                    else if (arr1[k] > arr2[k]) {
                        System.out.println("DRAGON");
                        break;
                    } else if (arr2[k] > arr1[k]) {
                        System.out.println("SLOTH");
                        break;
                    } else if (arr1[k] == arr2[k]) {
                        continue;

                    }
                }
            }

        }
    }
}
