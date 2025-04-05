
public class cc1000 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int size = sc.nextInt();
            sc.nextLine();
            String nam = sc.nextLine();
            char[] arr = nam.toCharArray();
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u') {
                    counter = 0;
                } else {
                    counter++;
                    if (counter >= 4) {
                        break;
                    }
                }
            }
            if (counter >= 4) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
