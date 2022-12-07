class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
        Arrays.sort(arr);
        int diff=arr[n-1]-arr[n-2];
        for(int i=n-2;i>0;i--){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
        
    }
}
