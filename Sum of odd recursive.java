import java.util.*;

class Main {
    static int sumofodd(int arr[], int i, int n){
        if(n==i){
            return 0;
        }
        else{
                if(arr[i]%2!=0){
                    return arr[i]+sumofodd(arr,i+1,n);
                }
                else{
                    return sumofodd(arr,i+1,n);
                }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumofodd(arr,0,n));
        sc.close();
    }
}