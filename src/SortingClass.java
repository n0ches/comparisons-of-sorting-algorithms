
public class SortingClass {
	
	// HEAP SORT \\
	
	public void heapSort(int[] arr) {
		int size = arr.length;
		
		for (int i = size/2 -1; i>=0; i--) {
			maxHeap(arr,size,i);
		}
		
		for (int i = size-1; i >0; i--) {
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeap(arr,i,0);
		}
	}
	
	public static void maxHeap(int[] arr, int size, int i) {
		int largesttPos=i; 
		int leftPos=2*i+1; 
		int rightPos=2*i+2;
		
		
		if(leftPos < size && arr[leftPos] > arr[largesttPos])
			largesttPos = leftPos;
		
		if(rightPos < size && arr[rightPos] > arr[largesttPos])
			largesttPos=rightPos;
		
		if(largesttPos != i) {
			int temp = arr[i];
			arr[i]=arr[largesttPos];
			arr[largesttPos]=temp;
			maxHeap(arr,size,largesttPos);
		}
	}
	
	// HEAP SORT \\
	
	// DUAL PIVOT QUICK SORT \\
	
	public void dualPivotQuickSort(int[] array, int mostLeft, int mostRight) {
		if(mostLeft <mostRight) {
			int [] partitonArray = partition(array, mostLeft, mostRight);
			int lp=partitonArray[0];
			int rp=partitonArray[1];
			dualPivotQuickSort(array,mostLeft,lp-1);
			dualPivotQuickSort(array,lp+1,rp-1);
			dualPivotQuickSort(array,rp+1,mostRight);
		}
	}
	
	public static int[] partition(int[] array, int mostLeft, int mostRight) {
		if(array[mostLeft] > array[mostRight])
			exchange(array,mostLeft,mostRight);
		
		int i=mostLeft+1;
		int j=mostRight-1;
		int loopTemp=mostLeft+1;
		int leftPivot=array[mostLeft];
		int rightPivot=array[mostRight];
		
		while(loopTemp<=j) {
			
			if(array[loopTemp] < leftPivot) {
				exchange(array,loopTemp,i);
				i++;
			}
			
			else if(array[loopTemp] >= rightPivot) {
				while(array[j] > rightPivot && loopTemp < j) {
					j--;
				}
				exchange(array,loopTemp,j);
				j--;
				if(array[loopTemp] < leftPivot) {
					exchange(array,loopTemp,i);
					i++;
				}
			}
			loopTemp++;
		}
		i--;
		j++;
		
		exchange(array,mostLeft,i);
		exchange(array,mostRight,j);
		
		int [] partitionArray = new int[2];
		partitionArray[0]=i;
		partitionArray[1]=j;
		
		return partitionArray;
	}
	
	public static void exchange(int[] array,int a, int b) {
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	
	// DUAL PIVOT QUICK SORT \\
	
	// SHELL SORT \\
	
	public void shellSort(int[]arr) {
		int size = arr.length;
		for (int gap = size/2; gap >=1; gap=gap/2) {
			for (int i = gap; i < size; i++) {
				int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
			}
		}
	}
	
	// SHELL SORT \\
	
	
	public void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" -> ");
		}
	}
}
