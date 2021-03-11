import java.util.Random;

public class TestSort {
		
	
	 public static void main(String args[]) 
	    { 
		 	SortingClass s = new SortingClass();
		 	Timer time=new Timer();
		 	Random rnd = new Random();
		 	
		 	int n = 10000; /* array size variable, please change it for tests. */
		 	
		 	int[] heapSortArray=new int[n];
		 	int[] quickSortArray=new int[n];
		 	int[] shellSortArray=new int[n];
		 	
		 	for (int i = 0; i < n; i++) {
		 		heapSortArray[i]=16;
		 		quickSortArray[i]=16;
		 		shellSortArray[i]=16;
		 	}
		 	
		 	System.out.println("## "+n+" EQUAL INTEGER ##");
		 	System.out.println("---------------------------------------------------------\n");
		 	System.out.println("Before Sorting: ");
		 	s.print(heapSortArray);
		 	System.out.println();
		 	time.start();
		 	s.heapSort(heapSortArray);
		 	time.stop();
		 	System.out.println("After sorting by heap sort: ");
		 	s.print(heapSortArray);
		 	System.out.println("\nHeap sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(quickSortArray);
		 	System.out.println();
		 	time.start();
		 	s.dualPivotQuickSort(quickSortArray,0,n-1);
		 	time.stop();
		 	System.out.println("After sorting by dual pivot quick sort: ");
		 	s.print(quickSortArray);
		 	System.out.println("\nDual pivot quick sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(shellSortArray);
		 	System.out.println();
		 	time.start();
		 	s.shellSort(shellSortArray);
		 	time.stop();
		 	System.out.println("After sorting by shell sort: ");
		 	s.print(shellSortArray);
		 	System.out.println("\nShell sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	heapSortArray=new int[n];
		 	quickSortArray=new int[n];
		 	shellSortArray=new int[n];
		 	
		 	for (int i = 0; i < n; i++) {
		 		heapSortArray[i]=rnd.nextInt(n);
		 		quickSortArray[i]=rnd.nextInt(n);
		 		shellSortArray[i]=rnd.nextInt(n);
		 	}
		 	
		 	System.out.println("\n## "+n+" RANDOM INTEGER ##");
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(heapSortArray);
		 	System.out.println();
		 	time.start();
		 	s.heapSort(heapSortArray);
		 	time.stop();
		 	System.out.println("After sorting by heap sort: ");
		 	s.print(heapSortArray);
		 	System.out.println("\nHeap sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(quickSortArray);
		 	System.out.println();
		 	time.start();
		 	s.dualPivotQuickSort(quickSortArray,0,quickSortArray.length-1);
		 	time.stop();
		 	System.out.println("After sorting by dual pivot quick sort: ");
		 	s.print(quickSortArray);
		 	System.out.println("\nDual pivot quick sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(shellSortArray);
		 	System.out.println();
		 	time.start();
		 	s.shellSort(shellSortArray);
		 	time.stop();
		 	System.out.println("After sorting by shell sort: ");
		 	s.print(shellSortArray);
		 	System.out.println("\nShell sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	
		 	heapSortArray=new int[n];
		 	quickSortArray=new int[n];
		 	shellSortArray=new int[n];
		 	
		 	for (int i = 0; i < n; i++) {
		 		heapSortArray[i]=i;
		 		quickSortArray[i]=i;
		 		shellSortArray[i]=i;
		 	}
		 	
		 	System.out.println("\n## "+n+" INCREASING INTEGER ##");
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(heapSortArray);
		 	System.out.println();
		 	time.start();
		 	s.heapSort(heapSortArray);
		 	time.stop();
		 	System.out.println("After sorting by heap sort: ");
		 	s.print(heapSortArray);
		 	System.out.println("\nHeap sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(quickSortArray);
		 	System.out.println();
		 	time.start();
		 	s.dualPivotQuickSort(quickSortArray,0,quickSortArray.length-1);
		 	time.stop();
		 	System.out.println("After sorting by dual pivot quick sort: ");
		 	s.print(quickSortArray);
		 	System.out.println("\nDual pivot quick sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(shellSortArray);
		 	System.out.println();
		 	time.start();
		 	s.shellSort(shellSortArray);
		 	time.stop();
		 	System.out.println("After sorting by shell sort: ");
		 	s.print(shellSortArray);
		 	System.out.println("\nShell sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	
		 	heapSortArray=new int[n];
		 	quickSortArray=new int[n];
		 	shellSortArray=new int[n];
		 	int k=0;
		 	for (int i = n-1; i >= 0; i--) {
		 		heapSortArray[k]=i;
		 		quickSortArray[k]=i;
		 		shellSortArray[k]=i;
		 		k++;
		 	}
		 	
		 	System.out.println("\n## "+n+" DECREASING INTEGER ##");
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(heapSortArray);
		 	System.out.println();
		 	time.start();
		 	s.heapSort(heapSortArray);
		 	time.stop();
		 	System.out.println("After sorting by heap sort: ");
		 	s.print(heapSortArray);
		 	System.out.println("\nHeap sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(quickSortArray);
		 	System.out.println();
		 	time.start();
		 	s.dualPivotQuickSort(quickSortArray,0,quickSortArray.length-1);
		 	time.stop();
		 	System.out.println("After sorting by dual pivot quick sort: ");
		 	s.print(quickSortArray);
		 	System.out.println("\nDual pivot quick sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------\n");
		 	
		 	System.out.println("Before Sorting: ");
		 	s.print(shellSortArray);
		 	System.out.println();
		 	time.start();
		 	s.shellSort(shellSortArray);
		 	time.stop();
		 	System.out.println("After sorting by shell sort: ");
		 	s.print(shellSortArray);
		 	System.out.println("\nShell sort time: "+ time.getElapsedMiliSeconds()+" ms");
		 	
		 	System.out.println("---------------------------------------------------------");
		 	
		 	

	    } 

}
