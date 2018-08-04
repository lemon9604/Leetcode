public static void quickSort(int[] array, int low, int high) {// 传入low=0，high=array.length-1;
        int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
        if (low < high) {
            p_pos = low;
            pivot = array[p_pos];
            for (i = low + 1; i <= high; i++)
                if (array[i] > pivot) {
                    p_pos++;
                    t = array[p_pos];
                    array[p_pos] = array[i];
                    array[i] = t;
                }
            t = array[low];
            array[low] = array[p_pos];
            array[p_pos] = t;
            // 分而治之
            quickSort(array, low, p_pos - 1);// 排序左半部分
            quickSort(array, p_pos + 1, high);// 排序右半部分
        }
    }
	
	public static int arrayPairSum(int[] nums){
	
		quickSort(nums, 0, nums.length-1);
		int sum = 0;
		for (int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
			if (i % 2 == 1){
				sum += nums[i];

			}
		}
		return sum;
	}