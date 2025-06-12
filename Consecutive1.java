public class Consecutive1{
    public static void main(String[] args) {
        int maxx=0;
        int count=0;
        int nums[] = {1,1,0,1,1,1};
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count++;
                maxx = Math.max(maxx,count);
            }else{
                count=0;
            }
        }
        System.out.println(maxx);
    }
}