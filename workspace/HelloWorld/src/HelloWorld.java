//: Property.java
import java.util.*;
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
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("---MemoryUsage:");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = "
							+ rt.totalMemory()
							+ ";"
							+ " Free Memory = "
							+ rt.freeMemory());
	}
}
//: Property.java

//public class HelloWorld {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub		
//		System.out.println("Hello world!");
//	}
//
//}
