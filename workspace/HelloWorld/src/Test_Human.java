/**
 * @author xiaoming
 *
 */
class Human {
	public Human(int h)
	{
		this.height = h;
		Human.population += 1; //利用构造函数自动改变类中的变量
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public void growHeight(int h)
	{
		this.height = this.height + h;
	}
	
	public void breath()
	{
		System.out.println("hu...hu...");
	}
	public double getPi()
	{
		return Human.pi;
	}
	
	//静态方法（也叫类方法），只能调用static的数据和方法
	public static int getPopulation()
	{
		return Human.population;
	}
	
	private int height;
	private static int population = 0;
	public static boolean is_mammal = true;
	//定义常量
	private final static double pi = 3.1415926;
}

public class Test_Human
{
	public static void main(String[] args)
	{
		System.out.println(Human.getPopulation());
		Human aPersion = new Human(160);
		System.out.println(aPersion.getPopulation()); //不建议用这种方法调用静态方法，应该直接使用类名.静态方法的方式调用
		Human aPersion2 = new Human(170);
		System.out.println(Human.getPopulation() + "," +aPersion2.getPi());
	}
}

