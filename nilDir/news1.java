void prelocateDown(int i) {
	int l = getLeft();
	int r = getRight();
	int max = i;
	if(l != -1 && arr[l] < arr[i])
		max = l;
	
	if(r != -1 && arr[r] < arr[max])
		max = r;
	
	if(max != i) {
		swap(arr, i max);
		prelocateDown(arr, max)
	}
}