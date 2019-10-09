//Linda Yip
//Mancala Part 5
//10.15.19
//Description: Program outputs a mancala board using stars and spaces
//		with numbers in the spaces
// 

public class MancalaPt5_LY
{

	public static void main( String[ ] args )
	{
		int[] beadArray = new int[14];
		
		startingArray(beadArray);
		printArray(beadArray);
		
		System.out.println();
		
		showBoard (beadArray);

	}// end main

	/*********************************************************************************
	 * makeSolidLine 
	 * Description: Takes an integer and outputs a line of stars (*) in the amount equal to the integer
	 * parameter: The number of stars to output 
	 * return value: None
	 *********************************************************************************/
	public static void makeSolidLine( int numStars )
	{
		for ( int i = 0; i < numStars; ++i )
		{
			System.out.print ( "*" );
		}
	}// end makeSolid Line

	/*********************************************************************************
	 * makeDottedLine 
	 * Description: Outputs dotted line - a star and six spaces 8 times, and then an extra star 
	 * parameter:	None
	 * return value: None
	 *********************************************************************************/
	public static void makeDottedLine( )
	{
		for ( int i = 0; i < 8; ++i )
		{
			System.out.print ( "*" );
			for ( int s = 0; s < 6; ++s )
			{
				System.out.print ( " " );
			}
		}

		System.out.print ( "*" );
		System.out.println ( "" );

	}// end makeDottedLine

	/*********************************************************************************
	 * showTopRowNumbers 
	 * Description: Outputs the lines with the top row of the board numbers (0 - 5) 
	 * parameter: None
	 * return value: None
	 *********************************************************************************/
	public static void showTopRowNumbers( )
	{
		System.out.print ( "*      " );
		for ( int i = 0; i < 6; ++i )
		{
			System.out.printf ( "*%4d  ", i );
		}
		System.out.print ( "*      *" );
		System.out.println ( );
	}// end showTopRowNumbers

	/*********************************************************************************
	 * showBottomRowNumbers 
	 * Description: Outputs the lines with the bottom row of the board numbers (7 - 12) 
	 * parameter: None
	 * return value: None
	 *********************************************************************************/
	public static void showBottomRowNumbers( )
	{
		System.out.print ( "*      " );
		for ( int i = 12; i > 6; --i )
		{
			System.out.printf ( "*%4d  ", i );
		}
		System.out.print ( "*      *" );
		System.out.println ( );
	}// end showBottomRowNumbers

	/*********************************************************************************
	 * showBoard 
	 * Description: Builds the Mancala board with numbered bins 
	 * parameter: None 
	 * return value: None
	 * @param beadArray 
	 *********************************************************************************/
	public static void showBoard(int [] beadArray)
	{
		makeSolidLine ( 57 );
		System.out.println ( );
		makeDottedLine ( );
		showTopRowNumbers ( );
		makeDottedLine ( );
		showTopBins (beadArray);
		makeDottedLine ( );

		System.out.print ( "*  13  " );
		makeSolidLine ( 57 - 14 );
		System.out.println ( "   6  *" );

		makeDottedLine ( );
		showBottomRowNumbers ( );
		makeDottedLine ( );
		showBottomBins(beadArray);
		makeDottedLine ( );
		makeSolidLine ( 57 );

	}// end showBoard

	/*************************************************************************
	 * startingArray
	 * Description: fills array of beads
	 * parameter: beadArray
	 * return: None
	 *************************************************************************/
	public static void startingArray(int[] beadArray)
	{
		for (int i = 0; i < beadArray.length; ++i)
		{
			beadArray[i] = 4;
		}
		beadArray[6] = 0;
		beadArray[13] = 0;
		
		beadArray[1] = 7; //FIXME: for testing purposes
		beadArray[4] = 11;
		beadArray[5] = 2;
		beadArray[13] = 6;
		beadArray[10] = 3;
	}//end startingArray
	
	/*************************************************************************
	 * printArray
	 * Description: prints out the array of beads
	 * parameter: beadArray
	 * return: None
	 *************************************************************************/
	public static void printArray (int[] beadArray)
	{
		for (int i = 0; i < beadArray.length; ++i)
		{
			System.out.print(beadArray[i] + " ");
		}
	}//end printArray
	
	/*********************************************************************************
	 * showTopBins 
	 * Description: Outputs the lines with the top row of the bead numbers (0 - 5) 
	 * parameter: beadArray
	 * return value: None
	 *********************************************************************************/
	public static void showTopBins(int[] beadArray )
	{
		System.out.print ( "*      " );
		for ( int i = 0; i < 6; ++i )
		{
			System.out.printf ( "*%4d  ", beadArray[i] );
		}
		System.out.print ( "*      *" );
		System.out.println ( );
	}// end showTopBins

	
	/*********************************************************************************
	 * showBottomBins
	 * Description: Outputs the lines with the bottom row of the bead numbers (7 - 12)
	 * 	also end bins 6 and 13
	 * parameter: beadArray
	 * return value: None
	 *********************************************************************************/
	public static void showBottomBins(int[] beadArray )
	{
		//System.out.print ( "*      " );
		for ( int i = 13; i > 5; --i )
		{
			System.out.printf ( "*%4d  ", beadArray[i] );
		}
		//System.out.print ( "*      *" );
		System.out.println ( );
	}// end showBottomBins
	
}

// Problems:
// Part 1: 1) Compiler error in method makeSolidLIne. SOLUTION - forgot to declare "i" counter as an int.
// 2) Star lines not printing as two separate lines. SOLUTION - change SOP to SOPln.
// Part 2: 1) Syntax error. SOLUTION: Forgot a ; in the loop condition