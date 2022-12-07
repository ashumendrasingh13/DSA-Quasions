//SOLUTION 1-->>

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        
    }
}

--------------------------------------------------------------------------------------------------------------
//SOLUTION 2-->>

class Solution {
    public void sortColors(int[] array) {
        for(int i = 1; i < array.length; i++){
            int keyValue = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > keyValue){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyValue;

        }
        
    }
}
