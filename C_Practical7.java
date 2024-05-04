//one dimension array
class arrayEx {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("value of arr[" + i + "] is " + arr[i]);
        }
    }
}


//two dimension array
class arrayEx2{
    public static void main(String[] args) {
        int[][] arr = {{10, 20}, {30, 40}}; // declaring and Initializing array

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // Accessing variables
                System.out.println("value of arr[" + i + "][" + j + "] is " + arr[i][j]);
            }
        }
    }
}

//largest number 
import java.util.Scanner;
class largerNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float[] arr = new float[100];
		System.out.print("Enter total number of elements (1 to 100)");
		int n = scanner.nextInt();
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.println("Enter Number "(i+1)+ ":");
			arr[i] = scanner.nextFloat();
		}
		float largest = arr[0];
		for(int i =1; i<n; i++){
		if(arr[i] > arr[0]){
		largest = arr[i];
		}
	}
	System.out.println("largest number = " + largest);
}
}
	



