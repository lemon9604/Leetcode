540. Single Element in a Sorted Array

public int singleNonDuplicate(int[] nums) {
    int i;
    for (i = 0; i < nums.length / 2 ; i ++){
        if (nums[i * 2] != nums[i * 2 + 1]){
            return nums[i * 2];
        }
    }
    return nums[i * 2];
}