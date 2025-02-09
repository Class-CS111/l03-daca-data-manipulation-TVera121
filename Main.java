// STUDENT NAME: Tony Vera
// DATE: 2/4/2025

import org.checkerframework.checker.units.qual.A;

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int day, month, year; //Integers from the day/month/year to be converted to Julian
		int y, m, a; //Variables used to calculate the Julian Number Days
		//String x ="Julian Day Number for ";

		/***** INITIALIZATION SECTION *****/
		int todayDay =2, todayMonth = 2, todayYear =2020; //Kathrine Johnson uses 2/2/202 for Today's Date
		int birthdayDay = 26, birthdayMonth = 8, birthdayYear = 1918 ; //Kathrine Johnson's Birthday is 2/26/1918
		int daysAlive, approximateAge;
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		day = todayDay;
		month = todayMonth;
		year = todayYear;
		a = (14 - month) / 12; //Formula to calculate 'a'; for the months of January and February 'a' will be 1 and 0 for the months of March through December
		m = month + 12*a -3; //Formula to calculate 'm'
		y = year + 4800 -a; //Formula to calculate 'y'
		int todayJDN = day + (153*m + 2)/5 + 365*y + y/4 - y/100 + y/400 -32045; //Formula to calculate Julian Number Days

		day = birthdayDay;
		month = birthdayMonth;
		year = birthdayYear;
		a = (14 - month) / 12; //Formula to calculate 'a'; for the months of January and February 'a' will be 1 and 0 for the months of March through December
		m = month + 12*a -3; //Formula to calculate 'm'
		y = year + 4800 -a; //Formula to calculate 'y'
		int birthdayJDN = day + (153*m + 2)/5 + 365*y + y/4 - y/100 + y/400 -32045; //Formula to calculate Julian Number Days

		daysAlive = todayJDN - birthdayJDN;
		approximateAge = daysAlive/365;
		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " + todayMonth + "/" + todayDay + "/" + todayYear + ", is " + todayJDN + "\n");
		//System.out.println(); //Print New Line
		System.out.println("Julian Day Number for birhtday, " + birthdayMonth + "/" + birthdayDay + "/" + birthdayYear + ", is " + birthdayJDN + "\n");
		//System.out.println(); //Print New Line
		System.out.println("The difference in days is " + daysAlive + " which makes you approximately " + approximateAge +" years old!" + "\n");
		//System.out.println();
  }
}