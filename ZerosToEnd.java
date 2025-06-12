public class ZerosToEnd{
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,4,0,5,6};
        int n= arr.length; 

        int j=-1;
        //updating j value(pointer which keeps track of zero element)
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        //no non zero numbers
        if(j == -1){
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }
        
        for(int i = j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}