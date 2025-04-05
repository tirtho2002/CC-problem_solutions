public class cc1013 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int arr_size=sc.nextInt();
            int B_arr[]=new int[arr_size];
            int A_arr[]=new int[arr_size];
            for(int i=0;i<arr_size;i++){

                B_arr[i]=sc.nextInt();
            }

            for(int j=0;j<arr_size-1;j++){
                if(j==0){
                    if(B_arr[j]==1){
                        A_arr[j]=1;
                        A_arr[j+1]=2;
                    }
                    else{
                        A_arr[j]=1;
                        A_arr[j+1]=1;
                    }
                }
                else{
                    if(B_arr[j]==0){
                        if(A_arr[j]==1){
                            A_arr[j+1]=1;
                        }
                        else{
                            A_arr[j+1]=2;
                        }
                    }
                    else{
                        if(A_arr[j]==1){
                            A_arr[j+1]=2;
                        }
                        else{
                            A_arr[j+1]=1;
                        } 
                    }
                }
            }

            int result=(A_arr[arr_size-1]+A_arr[0])%2;
            
            if(result==B_arr[arr_size-1]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
    
}
