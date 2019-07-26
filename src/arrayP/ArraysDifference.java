package arrayP;

import java.util.ArrayList;

public class ArraysDifference {
	
	public static void main(String[] args) {
		
		String singleArray[]=new String[3];
		singleArray[0]="Love";
		singleArray[1]="is";
		singleArray[2]="Air";
		
		System.out.println("Single Array pointing to index 1: " +  singleArray[1]);
		//print all with for loop
		
		for(int i=0; i<singleArray.length; i++) {
			System.out.println("Single Array print out: " + singleArray[i]);
		}
		
		//2D array - rows and columns
		
		String doubleDArray[][]=new String[3][4];
		//first row
		doubleDArray[0][0]="No!";
		doubleDArray[0][1]="It is not";
		doubleDArray[0][2]="in the";
		doubleDArray[0][3]="Air";
		
		doubleDArray[1][0]="No!";
		doubleDArray[1][1]="It is not";
		doubleDArray[1][2]="in the";
		doubleDArray[1][3]="Air";
		
	
		doubleDArray[2][0]="No!";
		doubleDArray[2][1]="It is not";
		doubleDArray[2][2]="in the";
		doubleDArray[2][3]="Air";
		
		System.out.println("double print out first rows and col: "+ doubleDArray[0][2] );
		
		for(int row=0; row<doubleDArray.length; row++) {
			for(int col=0; col<doubleDArray[0].length; col++) {
			
			System.out.println("Double Array print out: " +doubleDArray[row][col]);
		
			}
		}
		
		//ArrayList
		ArrayList arrayList= new ArrayList();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add('B');
		arrayList.add("Listing arrays ");
		
		System.out.println("size of list array: "+ arrayList.size());
		
		for(int t=0; t<arrayList.size(); t++) {
			System.out.println("Array List print out " +arrayList.get(t) );
			
		}
		
		
		//Hashtables
		
		
		
		
		
		}//end of staic main

}
