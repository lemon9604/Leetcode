public static int PeakIndexinaMountainArray(int[] A){
	int n = 1;
	while (A[n] < A[n+1]){
		n++;
	}
	return n;
}