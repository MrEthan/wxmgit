
/**
 * 打印从命令行读取的输入参数。
 */
public class PrintInputArgs 
{
	public static void main(String []args)
	{
		//System.out.println(args[0] + " " + args[1] + " " + args[2]);
		String str;
		if(null != args[0])
		{
			str = args[0];
			System.out.println(str);
		}
	}
}
