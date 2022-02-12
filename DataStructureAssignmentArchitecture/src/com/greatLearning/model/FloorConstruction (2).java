package com.greatLearning.model;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Stack;


public class FloorConstruction {
	
	
	

	
	
	
	public void orderOfConstruction() {
		
		
	
        Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("enter the total number of floors in the building  : ");
		int number = sc.nextInt();
		int [] floorsize = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("enter the floor size given on Day: " + (i + 1 ) );
			floorsize[i] = sc.nextInt();
			
	    		
		}
		int[] floorSize2 = new int[floorsize.length];
		
		for (int i = 0; i < floorsize.length; i++) {
			floorSize2[i] = floorsize[i];	
			
		}
		
		Arrays.sort(floorSize2);
		
		
		Stack sizefloor = new Stack();
		for (int i : floorSize2) {
			sizefloor.push(i);
			
		}
		System.out.println("\nThe order of construction os as follows : ");
		Stack temp = new Stack();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Day: " + (i + 1));
                        int sizeday= floorsize[i];
            
                        int largestFloorSize = (Integer) sizefloor.peek();
                        if (sizeday != largestFloorSize) {
				temp.push(sizeday);
            		} 
			else {
                		System.out.print(sizefloor.pop() + " ");
               	 		while (!temp.isEmpty() && sizefloor.peek() == temp.peek()) {
                    			System.out.print(sizefloor.pop() + " ");
                    			temp.pop();
                		}
            		}
            		System.out.println("");
        	}
        
       
    	}
		
		
}
	
	

	


