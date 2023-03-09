package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0)
			return 0;
		else
			return Math.pow(0.5, n)+geometricSum(n-1);
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p%q==0)
			return q;
		else
			return gcd(q,p%q);
	
	}
	
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int revArray[]=new int [array.length];
		if (array.length==0)
			return revArray;
		if (array.length==1)
			{revArray[0]=array[0];
			return revArray;}
		else
			return reversedArray(array,revArray,0,array.length-1);
		
	}
	public static int[] reversedArray(int[] array, int[] revArray, int start, int end)
	{
		if (array.length % 2 !=0)
		{
			if (start==end)
				revArray[start]=array[end];
			else
				{
				revArray[start]=array[end];
				revArray[end]=array[start];
				reversedArray(array, revArray, start+1, end-1);
				}
			return revArray;
		}
		
		else
		{
			if (start==end - 1)
			{
				revArray[start]=array[end];
				revArray[end] = array[start];
			}
				
			else
				{
				revArray[start]=array[end];
				revArray[end]=array[start];
				reversedArray(array, revArray, start+1, end-1);
				}
			return revArray;
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius>radiusMinimumDrawingThreshold)
		{
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter+radius,yCenter,radius/3.0,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius,yCenter,radius/3.0,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter,yCenter+radius,radius/3.0,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter,yCenter-radius,radius/3.0,radiusMinimumDrawingThreshold);
		}
			
		
	}

}
