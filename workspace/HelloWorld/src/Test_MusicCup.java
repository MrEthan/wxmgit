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

//�ӿ�
interface Cup {
    void addWater(int w);
    void drinkWater(int w);
}
interface Music {
    void play();
}
/**
 �ùؼ���implement������ʵ�ֽӿ�
 ����ʵ�ֽӿ��ڵ�ȫ��������ͬʱ������Ӳ��ٽӿ��ڵĺ���
 Ҳ������ͬһ������ʵ�ֲ�ͬ�Ľӿ�
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
    
    public int getWaterLeft() //�ǽӿ�
    {
        return this.water;
    }
    
    public void play() //Music�ӿ�
    {
        System.out.println("la..la..la..\n");
    }
    
    private int water = 0;
}