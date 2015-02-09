import java.util.Random;

public class Main {

	static Random rand;
	static int orgArray [];
	static int unList [];
	
	
	static long startTime;
	static long endTime;
	
	
	static int componentSize = 5000;
	static long operationTime = 0;
	
	
	public static void init (){
		rand = new Random();
		orgArray = new int [componentSize];
	}
	
	public static void selectionSort() {
		for (int i = 0; i < unList.length; i++) {
			int min = unList[i];
			int minIndex = i;
			for (int j = i + 1; j < unList.length; j++) {
				if (min > unList[j]) {
					min = unList[j];
					minIndex = j;
				}
			}
			unList[minIndex] = unList[i];
			unList[i] = min;

		}
	}
	

	public static void printArray(int a[], int org []) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("%d\t%d\n", org[i],a[i]);
			System.out.println();

	}
	
	public static void printArray (int a[]){
		for (int i = 0; i < a.length; i++){
			System.out.print(String.format("%d\t", a[i]));
		}
		System.out.println();
	}

	public static int[] generateArray() {
		int[] a = new int[componentSize];

		for (int i = 0; i < componentSize; i++) {
			a[i] = getRandomNumber(214748364);
			
			if (a[i]==0){
				a[i] = i;
			}
		}
		//orgArray = a ;
		return a;
	}
	


	public static int getRandomNumber(int max) {
		return rand.nextInt(max);
	}
	
	public static void startTimer (){
		startTime = System.currentTimeMillis();
	}
	
	public static void finishTimer (){
		endTime = System.currentTimeMillis();
	}
	
	public static void printTime (){
		operationTime = endTime - startTime;
		System.out.println(String.format("Operation Finished at %d Milliseconds", operationTime));
		System.out.println(String.format("Average Index Operation Time Required: %02f ms", (double)componentSize/(double)operationTime ));
	}

	public static void main(String[] args) {
		init ();
		startTimer ();
		 orgArray  = generateArray();
		 unList = orgArray;
		 
		 
		 
		 //printArray (savedArray);
		 
		
		 printArray (orgArray);
		 
		 //printArray (unList, orgArray);
		selectionSort ();
		//printSingleArray (orgArray);
		
		
		printArray (unList);
		
		finishTimer();
		
		System.out.println("\n\n---------------------------------");
		
		printTime();
		
		
	}




}
