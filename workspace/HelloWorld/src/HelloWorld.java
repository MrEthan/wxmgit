import java.util.Date;
import java.util.Scanner;
/** The first Thinking in Java example program.
* Lists system information on current machine.
* @author Bruce Eckel
* @author http://www.BruceEckel.com
* @version 1.0
*/

public class HelloWorld{
	/** Sole entry point to class & application
	* @param args array of string arguments
	* @return No return value
	* @exception exceptions No exceptions thrown
	*/
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);

		if(scan.hasNext() == true)
		{
			String str = scan.next();
			System.out.println(str);
		}
		scan.close();
	}
}




