
public class cc1018 {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int size=sc.nextInt()*2;
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            bubbleSort(arr);
            int counter=1;

            for(int i=0;i<size-1;i++){
                if(arr[i]==arr[i+1]){
                    counter=1;
                    for(int j=i+1;j<size;j++){
                        if(arr[i]==arr[j]){
                            counter++;
                        }
                        else{
                            break;
                        }
                    }
                    
                }
                else{
                    continue;
                }
                if(counter>=3){
                    System.out.println("NO");
                    break;
                }
            }
            if(counter<3){
                System.out.println("YES");
            }
            

        }
        


    }
    
}
