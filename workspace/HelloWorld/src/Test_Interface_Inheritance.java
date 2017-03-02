
//接口
interface Cup {
    void addWater(int w);
    void drinkWater(int w);
}

interface Music {
    void play();
}

/**
 * @author xiaoming
 * @接口继承
 */
interface MetricCup extends Cup
{
	int WaterContent(); //新增方法，返回水量
}
/**
 * 接口多重继承
 * 接口MusicCup继承自Cup和Music
 */
interface MusicCup extends Cup, Music
{
	void display();
}
/**
 用关键字implement在类中实现接口
 必须实现接口内的全部函数，同时可以添加不再接口内的函数
 也可以在同一个类中实现不同的接口
*/    
class MusicCup2 implements MetricCup,MusicCup
{
	/**
	 * 构造函数
	 */
	MusicCup2(int w)
	{
		this.water = w;
	}
	/**
	 * 以下为接口实施
	 */
    public void addWater(int w)
    {
        this.water += w;      
    }
    public void drinkWater(int w)
    {
        this.water -= w;
    }  
    public void play() //Music接口
    {
        System.out.println("la..la..la..");
    }
    public void display() //接口MusicCup中的新增接口
    {
    	System.out.println("he..he..he..");
    }
    public int WaterContent()
    {
    	return this.water;
    }
    public int getWaterLeft() //非接口
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
