/**
 * @author xiaoming
 *
 */
class Human {
	public Human(int h)
	{
		this.height = h;
		Human.population += 1; //���ù��캯���Զ��ı����еı���
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
	
	//��̬������Ҳ���෽������ֻ�ܵ���static�����ݺͷ���
	public static int getPopulation()
	{
		return Human.population;
	}
	
	private int height;
	private static int population = 0;
	public static boolean is_mammal = true;
	//���峣��
	private final static double pi = 3.1415926;
}

public class Test_Human
{
	public static void main(String[] args)
	{
		System.out.println(Human.getPopulation());
		Human aPersion = new Human(160);
		System.out.println(aPersion.getPopulation()); //�����������ַ������þ�̬������Ӧ��ֱ��ʹ������.��̬�����ķ�ʽ����
		Human aPersion2 = new Human(170);
		System.out.println(Human.getPopulation() + "," +aPersion2.getPi());
	}
}

