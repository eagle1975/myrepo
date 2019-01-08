// Displays numbers, digits that are not repeated in other numbers in the array.
//23.10.2018

public class UniqueNumbers {
	static boolean flag;
    public static void main(String[] args) {
        int array[] = {11101, 222, 3333, 444, 5555, 66636, 7777, 88888, 999999, 0};
        int i, j;
        int[] numberArrayI;
        int[] numberArrayJ;
        
            for (i = 0; i < array.length; i++) {
            	numberArrayI = numberSeparation(array[i]); // we obtain an array consisting of decimal digits of the number of the original array
        	for ( j = 0; j < array.length; j++) {
            	if (i == j)
    	   			continue;
            	numberArrayJ = numberSeparation(array[j]);
    	   		flag =  numberComparison(numberArrayI, numberArrayJ); // comparison of array numbers by entry
                if (!flag)
                	break;
           }
            	if (!flag)
            		continue;
            	System.out.print(array[i] + " ");
        }
          	
    } 
    
    static int[] numberSeparation(int num) {
    	 int tempI;
         int tempJ;
         int numberArray;
         int numberTempArray;
         int[] tempArrayI = new int[0];
	 		numberArray =num;
	 		do {
	 			tempI = numberArray / 10;
	 			numberTempArray = numberArray % 10;
	 			tempArrayI = arrayAdd(numberTempArray, tempArrayI); //fill the array with digits of the number of the original array
	 			tempJ = tempI;
	 			numberArray = tempJ;
	 		}while (numberArray >= 1);
	 		return tempArrayI;
    }
    static int[] arrayAdd( int finde, int[] arr){
        int[] temp;
        temp = new int[arr.length + 1];
        for (int t = 0; t < arr.length; t++) {
            temp[t] = arr[t];
        }
        temp[arr.length] = finde;
        return temp;
        }
    static boolean numberComparison (int[] arrayI, int[] arrayJ) {
    	 boolean innerFlag = true;
    	 for (int m = 0; m < arrayI.length; m++) {
    			for (int k = 0; k <  arrayJ.length; k++) {
    		        if (arrayI[m] != arrayJ[k]) 
    		        	continue;
    		        else
    		        	innerFlag = false;
    		        return innerFlag;
    		     }
    	}
    	 return innerFlag;
     }
}


