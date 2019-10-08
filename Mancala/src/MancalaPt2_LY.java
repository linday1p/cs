//Linda Yip
//Mancala Part 2
//10.04.19
//Description: Program calls a method that will output a line of stars and
//		a method that outputs a line of stars and 8 spaces between the stars
// 

public class MancalaPt2_LY
{

	public static void main( String[ ] args )
	{
		makeSolidLine ( 5 );
		System.out.println ( "" );
		makeSolidLine ( 4 );
		System.out.println ( "" );

		makeDottedLine ( );
		makeDottedLine ( ); // tested with two calls to make sure println working

	}// end main

	/*********************************************************************************
	 * makeSolidLine Description: Takes an integer and outputs a line of stars (*) in 
	 * the amount equal to the integer
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
	 * makeDottedLine Description: Outputs dotted line - a star and six spaces 8 times, 
	 *  and then an extra star 
	 * parameter: None
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

}

// Problems:
// Part 1: 1) Compiler error in method makeSolidLIne. SOLUTION - forgot to declare "i" counter as an int.
// 			  2) Star lines not printing as two separate lines. SOLUTION - change SOP to SOPln.
// Part 2: 1) Syntax error. SOLUTION: Forgot a ; in the loop condition