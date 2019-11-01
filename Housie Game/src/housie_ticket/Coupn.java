package housie_ticket;

import java.util.Arrays;
import java.util.Random;

import random_no.RandomGenerator;

public class Coupn {

	private int noOfRows, noOfColumn, cellPerRow;

	public Coupn(int noOfRows, int noOfColumn, int cellPerRow) {
		this.noOfRows = noOfRows;
		this.noOfColumn = noOfColumn;
		this.cellPerRow = cellPerRow;
	}

	public int[][] getTicket() {
		Random randomGenerator = new Random();
		int min = 1, max = 10, noOfRows = 3, noOfColumn = 9;
		int[][] tNumber = new int[noOfRows][noOfColumn]; 
		for(int i = 0;i < noOfColumn;i++) {
			if(i!=0) {
				min = min+10;
				max += 10;
			}
			System.out.println("col "+i);
			
			for(int j = 0;j < noOfRows;j++) {
				int[] randomNumbers = getRandomNumber(min ,max);
				int rn = randomNumbers[(randomGenerator.nextInt(randomNumbers.length))];
				
				if(!Arrays.deepToString(tNumber).contains(rn+"")) {
					tNumber[j][i] = rn;
					System.out.println(tNumber[j][i]);
				}
				else {
					j--;
					//System.out.println(tNumber[j][i]+" T");
				}
			}
		}
		
		sortbyColumn(tNumber, noOfColumn, noOfRows) ;
		
		 for(int i = 0;i < noOfRows;i++) { 
			 String noSpace = "444"; 
			 int  noOfSpace = Character.getNumericValue(noSpace.charAt(randomGenerator.nextInt(noSpace.length()))); 
			 System.out.println("noSpace "+noOfSpace); 
			 int oldIndex = 0;
		   for(int k = 0;k < noOfSpace;k++) {
		  
		  //RandomGenerator rand = new RandomGenerator();
		  //int newIndex =rand.randomNo();
		  
		  int newIndex = randomGenerator.nextInt(9);
		 
		  
		  
		  if(oldIndex != newIndex || k == 0) { 
			  if(i==0 && tNumber[1][newIndex] == 0 && tNumber[2][newIndex] == 0) {
				  k--; 
			  }
			  else if(i==1 && tNumber[0][newIndex] == 0 && tNumber[2][newIndex] == 0) { 
				  k--;
			  } 
			  else if(i==2 && tNumber[0][newIndex]== 0 && tNumber[1][newIndex] == 0) { 
				  k--; 
			  } 
			  else {
		  System.out.println(i+" newIndex "+newIndex);
		  oldIndex = newIndex;
		  tNumber[i][newIndex] = 0; 
		  } } 
		  else { 
			  k--; 
			  } } }
		 
		return tNumber;
	}

	public int[] getRandomNumber(int min, int max) {
		System.out.println(min + " rn :- " + max);
		int[] randomNumbers;
		if (min == 1) {
			randomNumbers = new int[10];
		}
		/*
		 * else if(min == 51) { randomNumbers = new int[10]; //max = max+1; }
		 */
		else {
			randomNumbers = new int[10];
		}
		int j = 0;
		for (int i = min; i <= max; i++) {
			randomNumbers[j] = i;
			j++;
		}
		System.out.println("rn :- " + Arrays.toString(randomNumbers));// .toString(randomNumbers));
		return randomNumbers;
	}

	// Function to sort by column
	public void sortbyColumn(int arr[][], int col, int row) {
		for (int i = 0; i < col; i++) {
			int[] sCol = new int[row];
			for (int j = 0; j < row; j++) {
				sCol[j] = arr[j][i];
			}
			Arrays.sort(sCol);
			for (int k = 0; k < row; k++) {
				arr[k][i] = sCol[k];
			}
		}
	}

	public void showTicket(int[][] tNumber) {
		String ticket = "";
		for (int[] val1 : tNumber) {
			for (int val : val1) {
				if (val == 0) {
					ticket += "|    ";
				} else {
					ticket += "| " + val + " ";
				}
			}
			ticket += "|\n";
		}
		System.out.println(ticket);
	}

}
