public class Test_MusicCup
{
    public static void main(String [] args)
    {
        int water = 0;
        MusicCup m = new MusicCup();
        System.out.println("water:" + m.getWaterLeft());
        m.addWater(10);
        System.out.println("water:" + m.getWaterLeft());
        m.play();
    }
}

//接口
interface Cup {
    void addWater(int w);
    void drinkWater(int w);
}
interface Music {
    void play();
}
/**
 用关键字implement在类中实现接口
 必须实现接口内的全部函数，同时可以添加不再接口内的函数
 也可以在同一个类中实现不同的接口
*/    
class MusicCup implements Cup,Music
{
    public void addWater(int w)
    {
        this.water += w;      
    }
    
    public void drinkWater(int w)
    {
        this.water -= w;
    }
    
    public int getWaterLeft() //非接口
    {
        return this.water;
    }
    
    public void play() //Music接口
    {
        System.out.println("la..la..la..\n");
    }
    
    private int water = 0;
}