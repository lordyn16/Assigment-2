/**
 * Jordyn Garvey
 * Class ID: 369
 * Assignment #1
 * Creates class SimpleList that creates an manipulates an integer array.
 */


package cse360assign2;


/**
 * This creates an manipulates an integer array.
 * SimpleList has multiple methods to manipulate the array.
 * add() adds a new integer at index 0 of the list
 * remove() removes a specified integer form the list
 * toString() converts the list to a string
 * search() returns the index of specified integer 
 */
public class SimpleList {

	private int[] list;
	private int count;
	
	/**
	 * Class constructor allocates memory for list and the number of
	 * integers list.
	 * 
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Add method adds an integer at index 0 of the list array.
	 * It will shift all the elements of the array to the next value
	 * to make room at index 0.
	 * If the array is already full it will remove the last element
	 * from the list.
	 * 
	 * @param newValue		The new integer added at index 0 of the 
	 * 						array.
	 */
	
	public void add(int newValue) {
		int index = count; 
		
		//if the list is full the last element will "fall off" the list
		if(index == 10) {index--;} 
		
		while(index >= 1)
		{
			list[index] = list[index - 1];
			index--;
		}
		list[0] = newValue;
		if(count < 10) {count++;}
		
	}
	
	/**
	 * Remove method removes an integer from the list array.
	 * If it finds the integer it needs to remove it will remove it then
	 * continue though the list looking for more copies.
	 * 
	 * 
	 * @param intToRemove	The integer that will be removed from the 
	 * 						array
	 */
	public void remove(int intToRemove) {
		for(int index = 0; index < count; index++) {
			
			if (list[index] == intToRemove) {
				for(int shift = index; shift < count - 1; shift++) {
					
					list[shift] = list[shift + 1];	
				}
				
				count--;
				index--;
			}	
		}	
	}
	
	
	/**
	 * Will return the number of integers in the list array
	 * 
	 * @return 		number of integers in the list array
	 */
	public int count() {
		return count;
	}
	
	
	
	
	/**
	 * toString will return the integers in the list array as a string.
	 * It will leave a space between each integer.
	 * 
	 * 
	 * @return 		String of integers in the list array
	 */
	public String toString() {
		String toString;
		
		if(count == 0) {
			toString = "";
		}
		
		else {
			toString = Integer.toString(list[0]);
			for(int index = 1; index < count; index++) {
				toString = toString + " ";
				toString = toString + Integer.toString(list[index]);
			
			}
		}
		
		return toString;
	}
	
	
	/**
	 * search will search the list array for the specified integer and 
	 * return the index. If the integer is not found it will return -1.
	 * 
	 * @param findIndexOf	Is the specified integer that will be 
	 * 						searched for
	 * @return				The index of the the specified integer if the
	 * 						integer is not found it will return -1
	 */
	public int search(int findIndexOf) {
		int searchIndex = -1;
		
		for(int index = 0; index < count; index++) {
			if(list[index] == findIndexOf) {
				searchIndex = index;
				}
		}
		
		return searchIndex;
	}
	
	
	
}
