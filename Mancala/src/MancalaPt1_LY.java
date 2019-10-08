//Linda Yip
//Mancala Part 1
//10.03.19
//Description: Program calls a method that will output a line of stars
// 

public class MancalaPt1_LY
{

	public static void main( String[ ] args )
	{
		makeSolidLine(5);
		System.out.println("");
		makeSolidLine(4);
		System.out.println("");
		
				//Beginning of makeDotted Line
		for(int i = 0; i < 8; ++i)
		{
			System.out.print("*");
			for (int s = 0; s < 6; ++s)
			{
				System.out.print(" ");
			}
		}
		
		System.out.println("*");
				//End of makeDotted Line

	}//end main
	
/*********************************************************************************
	makeSolidLine
	Description:		Takes an integer and outputs a line of stars (*) in the amount
	equal to the integer
	parameter:	The number of stars to output
	return value:	None
*********************************************************************************/
	public static void makeSolidLine(int numStars)
	{
		for(int i = 0; i < numStars; ++i)
		{
			System.out.print("*");
		}
	}//end makeSolid Line

}

//Problems:
//Part 1: 1) Compiler error in method makeSolidLIne. SOLUTION - forgot to declare "i" counter as an int.
//			 2) Star lines not printing as two separate lines. SOLUTION - change SOP to SOPln.
//