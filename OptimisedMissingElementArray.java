public class OptimisedMissingElementArray{
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int n= arr.length;              //time: O(N);
                                        // space: O(1)
        int sum = (n * (n + 1)) / 2;
        int s2 = 0;
        for(int i=0;i<n-1;i++){
            s2 += arr[i];
        }
        System.out.println("Missing number is: "+(sum-s2));

        
    }
}