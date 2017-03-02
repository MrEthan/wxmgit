
//�ӿ�
interface Cup {
    void addWater(int w);
    void drinkWater(int w);
}

interface Music {
    void play();
}

/**
 * @author xiaoming
 * @�ӿڼ̳�
 */
interface MetricCup extends Cup
{
	int WaterContent(); //��������������ˮ��
}
/**
 * �ӿڶ��ؼ̳�
 * �ӿ�MusicCup�̳���Cup��Music
 */
interface MusicCup extends Cup, Music
{
	void display();
}
/**
 �ùؼ���implement������ʵ�ֽӿ�
 ����ʵ�ֽӿ��ڵ�ȫ��������ͬʱ������Ӳ��ٽӿ��ڵĺ���
 Ҳ������ͬһ������ʵ�ֲ�ͬ�Ľӿ�
*/    
class MusicCup2 implements MetricCup,MusicCup
{
	/**
	 * ���캯��
	 */
	MusicCup2(int w)
	{
		this.water = w;
	}
	/**
	 * ����Ϊ�ӿ�ʵʩ
	 */
    public void addWater(int w)
    {
        this.water += w;      
    }
    public void drinkWater(int w)
    {
        this.water -= w;
    }  
    public void play() //Music�ӿ�
    {
        System.out.println("la..la..la..");
    }
    public void display() //�ӿ�MusicCup�е������ӿ�
    {
    	System.out.println("he..he..he..");
    }
    public int WaterContent()
    {
    	return this.water;
    }
    public int getWaterLeft() //�ǽӿ�
    {
        return this.water;
    }
    
    private int water = 0;
}

class Test_Interface_Inheritance {
    public static void main(String [] args)
    {
        MusicCup2 m = new MusicCup2(5);
        System.out.println("water:" + m.getWaterLeft());
        m.addWater(10);
        System.out.println("water:" + m.getWaterLeft());
        m.play();
        m.display();
        System.out.println("WaterContent:" + m.WaterContent());
    }
}
