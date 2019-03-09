

import java.io.*;
public class sorting {

	public static void main(String[] args) throws IOException {
		//Generating 100 random numbers
		int[] hundredRand = new int[100];       
	    	    for(int i = 0; i < hundredRand.length; i++) {
	    	hundredRand[i] = (int)(Math.random()*100 + 1);
	    }	    
	   //Generating 1000 Random numbers
	   int[] ThousandRand = new int[1000];       
	    for(int i = 0; i < ThousandRand.length; i++) {
	    	ThousandRand[i] = (int)(Math.random()*1000 + 1);
	    }	
	    //Generating 10,000 Random integers
	    int[] TenThousandRand = new int[10000];       
	    for(int i = 0; i < TenThousandRand.length; i++) {
	    	TenThousandRand[i] = (int)(Math.random()*10000 + 1);
	    }	
	    //Generating 1,00,000 Random integers
	    int[] onelakhRand = new int[100000];       
	    for(int i = 0; i < onelakhRand.length; i++) {
	    	onelakhRand[i] = (int)(Math.random()*100000 + 1);
	    }	
	    
	    //Time needed to sort hundred random integers using Bubble sort	
	    long hunBubbleSortStart =System.nanoTime();
	    BubbleSort(hundredRand);
	    long hunBubbleSortEnd=System.nanoTime();
	    long hunBubble=hunBubbleSortEnd-hunBubbleSortStart;
	    
	    //Time needed to sort hundred random integers using Insertion sort
	    long hunInsertionSortStart =System.nanoTime();
	    Insertionsort(hundredRand);
	    long hunInsertionSortEnd=System.nanoTime();
	    long hunInsertion=hunInsertionSortEnd-hunInsertionSortStart;

	    //Time needed to sort hundred random integers using Selection sort
	    long hunSelectionSortStart =System.nanoTime();
	    Insertionsort(hundredRand);
	    long hunSelectionSortEnd=System.nanoTime();
	    long hunSelection=hunSelectionSortEnd-hunSelectionSortStart;
	    
	  //Time needed to sort Hundred random integers using Merge sort
	    long hunMergeSortStart =System.nanoTime();
	    mergeSort(hundredRand);
	    long hunMergeSortEnd=System.nanoTime();
	    long hunMerge=hunMergeSortEnd-hunMergeSortStart;
	    
	  //Time needed to sort hundred random integers using Heap sort	
	    long hunHeapSortStart =System.nanoTime();
	    HeapSort(hundredRand);
	    long hunHeapSortEnd=System.nanoTime();
	    long hunHeap=hunHeapSortEnd-hunHeapSortStart;
	    

	    //Time needed to sort Hundred random integers using Quick sort
	    long hunQuickSortStart =System.nanoTime();
	    QuickSort(hundredRand);
	    long hunQuickSortEnd=System.nanoTime();
	    long hunQuick=hunQuickSortEnd-hunQuickSortStart;

	    //Time needed to sort Thousand Random Integers using Bubble Sort
	    long ThousandBubbleSortStart =System.nanoTime();
	    BubbleSort(ThousandRand);
	    long ThousandBubbleSortEnd=System.nanoTime();
	    long ThousandBubble=ThousandBubbleSortEnd-ThousandBubbleSortStart;
	    
	    //Time needed to sort Thousand random integers using Insertion sort
	    long ThousandInsertionSortStart =System.nanoTime();
	    Insertionsort(ThousandRand);
	    long ThousandInsertionSortEnd=System.nanoTime();
	    long ThousandInsertion=ThousandInsertionSortEnd-ThousandInsertionSortStart;

	    //Time needed to sort Thousand random integers using Selection sort
	    long ThousandSelectionSortStart =System.nanoTime();
	    Selectionsort(ThousandRand);
	    long ThousandSelectionSortEnd=System.nanoTime();
	    long ThousandSelection=ThousandSelectionSortEnd-ThousandSelectionSortStart;
	    
	  //Time needed to sort Thousand Random Integers using Merge Sort
	    long ThousandMergeSortStart =System.nanoTime();
	    mergeSort(ThousandRand);
	    long ThousandMergeSortEnd=System.nanoTime();
	    long ThousandMerge=ThousandMergeSortEnd-ThousandMergeSortStart;

		 //Time needed to sort Thousand Random Integers using Quick Sort
		    long ThousandQuickSortStart =System.nanoTime();
		    QuickSort(ThousandRand);
		    long ThousandQuickSortEnd=System.nanoTime();
		    long ThousandQuick=ThousandQuickSortEnd-ThousandQuickSortStart;
		    
		    //Time needed to sort Thousand Random Integers using HeapSort
		    long ThousandHeapSortStart =System.nanoTime();
		    HeapSort(ThousandRand);
		    long ThousandHeapSortEnd=System.nanoTime();
		    long ThousandHeap=ThousandHeapSortEnd-ThousandHeapSortStart;
		    
		      
	    
	  //Time needed to sort TenThousand Random Integers using Bubble Sort
	    long TenThousandBubbleSortStart =System.nanoTime();
	    BubbleSort(TenThousandRand);
	    long TenThousandBubbleSortEnd=System.nanoTime();
	    long TenThousandBubble=TenThousandBubbleSortEnd-TenThousandBubbleSortStart;
	    
	    //Time needed to sort TenThousand random integers using Insertion sort
	    long TenThousandInsertionSortStart =System.nanoTime();
	    Insertionsort(TenThousandRand);
	    long TenThousandInsertionSortEnd=System.nanoTime();
	    long TenThousandInsertion=TenThousandInsertionSortEnd-TenThousandInsertionSortStart;

	    //Time needed to sort TenThousand random integers using Selection sort
	    long TenThousandSelectionSortStart =System.nanoTime();
	    Selectionsort(TenThousandRand);
	    long TenThousandSelectionSortEnd=System.nanoTime();
	    long TenThousandSelection=TenThousandSelectionSortEnd-TenThousandSelectionSortStart;
	    
	  //Time needed to sort TenThousand random integers using Merge sort
	    long TenThousandMergeSortStart =System.nanoTime();
	    mergeSort(TenThousandRand);
	    long TenThousandMergeSortEnd=System.nanoTime();
	    long TenThousandMerge=TenThousandMergeSortEnd-TenThousandMergeSortStart;
	    
	    //Time needed to sort TenThousand random integers using Quick sort
	    long TenThousandQuickSortStart =System.nanoTime();
	    QuickSort(TenThousandRand);
	    long TenThousandQuickSortEnd=System.nanoTime();
	    long TenThousandQuick=TenThousandQuickSortEnd-TenThousandQuickSortStart;
	    
	    
	  //Time needed to sort TenThousand Random Integers using Heap Sort
	    long TenThousandHeapSortStart =System.nanoTime();
	    HeapSort(TenThousandRand);
	    long TenThousandHeapSortEnd=System.nanoTime();
	    long TenThousandHeap=TenThousandHeapSortEnd-TenThousandHeapSortStart;

	  //Time needed to sort oneLakh Random Integers using Bubble Sort
	    long OnelakhBubbleSortStart =System.nanoTime();
	    BubbleSort(onelakhRand);
	    long OnelakhBubbleSortEnd=System.nanoTime();
	    long OnelakhBubble=OnelakhBubbleSortEnd-OnelakhBubbleSortStart;
	    
	    //Time needed to sort oneLakh random integers using Insertion sort
	    long OnelakhInsertionSortStart =System.nanoTime();
	    Insertionsort(onelakhRand);
	    long OnelakhInsertionSortEnd=System.nanoTime();
	    long OnelakhInsertion=OnelakhInsertionSortEnd-OnelakhInsertionSortStart;

	    //Time needed to sort OneLakhrandom integers using Selection sort
	    long OnelakhSelectionSortStart =System.nanoTime();
	    Selectionsort(onelakhRand);
	    long OnelakhSelectionSortEnd=System.nanoTime();
	    long OnelakhSelection=OnelakhSelectionSortEnd-OnelakhSelectionSortStart;
	    
	  //Time needed to sort TenThousand random integers using Merge sort
	    long OnelakhMergeSortStart =System.nanoTime();
	    mergeSort(onelakhRand);
	    long OnelakhMergeSortEnd=System.nanoTime();
	    long OnelakhMerge=OnelakhMergeSortEnd-OnelakhMergeSortStart;
	    
	    //Time needed to sort TenThousand random integers using Quick sort
	    long OnelakhQuickSortStart =System.nanoTime();
	    QuickSort(onelakhRand);
	    long OnelakhQuickSortEnd=System.nanoTime();
	    long OnelakhQuick=OnelakhQuickSortEnd-OnelakhQuickSortStart;
	    
	  //Time needed to sort one Lakh Random Integers using Bubble Sort
	    long OnelakhHeapSortStart =System.nanoTime();
	    HeapSort(onelakhRand);
	    long OnelakhHeapSortEnd=System.nanoTime();
	    long OnelakhHeap=OnelakhHeapSortEnd-OnelakhHeapSortStart;

	    

	    File f = new File("Output.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile()));
		bw.write("Array size  "+"Bubble Sort(ns)  "+"Insertion sort(ns)  "+"Selection sort(ns)  "+"Merge sort(ns)  "+"   Quick Sort(ns)  "+"   HeapSort(ns)"+"\n");
		bw.write("100           "+hunBubble+"(ns)       "+hunInsertion+"(ns)             "+hunSelection+"(ns)		"+hunMerge+"(ns)         "+hunQuick+"(ns)"+"         "+hunHeap+"(ns)"+"\n");
	    bw.write("1000          "+ThousandBubble+"(ns)      "+ThousandInsertion+"(ns)         "+ThousandSelection+"(ns)	  	"+ThousandMerge+"(ns)        "+ThousandQuick+"(ns)"+"        "+ThousandHeap+"(ns)"+"\n");
	    bw.write("10000         "+TenThousandBubble+"(ns)     "+TenThousandInsertion+"(ns)	    "+TenThousandSelection+"(ns)       "+TenThousandMerge+"(ns)        "+TenThousandQuick+"(ns)"+"        "+TenThousandHeap+"(ns)"+"\n");
	   bw.write("100000      "+OnelakhBubble+"(ns)     "+OnelakhInsertion+"(ns)	    "+OnelakhSelection+"(ns)	"+OnelakhMerge+"(ns)        "+OnelakhQuick+"(ns)       "+OnelakhHeap+"(ns)"+"\n");

		bw.close();
	

	}
	
	//Function to sort array using insertion sort

	public static void BubbleSort(int[] a) {
	      int n = a.length;
	      int temp = 0;

	      for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) {
	            if(a[j-1] > a[j]) {
	               temp = a[j-1];
	               a[j-1] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	}
	
	
	//Function to sort array using insertion sort
	   public static void Insertionsort(int a[]) 
	    { 
	        int n = a.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = a[i]; 
	            int j = i-1;
	            while (j>=0 && a[j] > key) 
	            { 
	                a[j+1] = a[j]; 
	                j = j-1; 
	            } 
	            a[j+1] = key; 
	        } 
	    } 
	   
	   
	   //function to sort an array using Selection Sort
	   public static void Selectionsort(int a[])  { 
	        int n = a.length;  
	        for (int i = 0; i < n-1; i++) 
	        { 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (a[j] < a[min_idx]) 
	                    min_idx = j; 
	  
	            int temp = a[min_idx]; 
	            a[min_idx] = a[i]; 
	            a[i] = temp; 
	        } 
	    }
	   
	   
	   //function  to sort an array using  merge sort
	   public static void mergeSort(int a[]) {
	        sort(a, 0, a.length-1); 
	    }
	   public static void merge(int a[], int left, int middle, int right) 
	    { 
	        int n1 = middle - left + 1; 
	        int n2 = right - middle; 
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        for (int i=0; i<n1; ++i) 
	            L[i] = a[left + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = a[middle + 1+ j]; 
	  
	  	        int i = 0, j = 0; 
	  
	        int k = left; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                a[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                a[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        
	        while (i < n1) 
	        { 
	            a[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	 
	        while (j < n2) 
	        { 
	            a[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	
	   public static void sort(int a[], int left, int right) 
	    { 
	        if (left < right) 
	        { 
	            int middle = (left+right)/2; 
	            sort(a, left, middle); 
	            sort(a , middle+1, right); 
	            merge(a, left, middle, right); 
	        } 
	       
	    } 
	   
	   
	   //Function to sort a array using Quick sort
	   public static void QuickSort(int a[]) {
	        Sort(a, 0, a.length-1); 
	    }
	   public static void Sort(int a[], int low, int high) 
	    { 
	        if (low < high) 
	        {
	            int pivot = partition(a, low, high);
	            sort(a, low, pivot-1); 
	            sort(a, pivot+1, high); 
	        }  
	    }
	   
	  public  static int  partition(int a[], int low, int high) 
	    { 
	        int pivot = a[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) 
	        { 
	            if (a[j] <= pivot) 
	            { 
	                i++; 
	                int temp = a[i]; 
	                a[i] = a[j]; 
	                a[j] = temp; 
	            } 
	        } 
	        int temp = a[i+1]; 
	        a[i+1] = a[high]; 
	        a[high] = temp; 
	        return i+1; 
	    } 
	  
	  //Function to sort a array using HeapSort
	
	  public static void HeapSort(int a[]) 
	    { 
	        int n = a.length; 
	  
	  	        for (int i = n / 2 - 1; i >= 0; i--) 
	            heapify(a, n, i); 
	  
	        for (int i=n-1; i>=0; i--) 
	        { 
	          
	            int temp = a[0]; 
	            a[0] = a[i]; 
	            a[i] = temp; 
	            
	            heapify(a, i, 0); 
	        } 
	    } 
	  
	
	    static void heapify(int a[], int n, int i) 
	    { 
	        int large = i; 
	        int l = 2*i + 1; 
	        int r = 2*i + 2;  
	  
	        if (l < n && a[l] > a[large]) 
	            large = l; 
	  
		        if (r < n && a[r] > a[large]) 
	            large = r; 
	  
	        if (large != i) 
	        { 
	            int temp = a[i]; 
	            a[i] = a[large]; 
	            a[large] = temp; 
	  
	            heapify(a, n, large); 
	        } 
	    } 
	  
	  }

