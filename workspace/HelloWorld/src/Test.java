/**
类和抽象
*/

public class Test
{
	public static void main(String[] args)
	{
		Torch t = new Torch(99); //创建的时候，利用构造函数初始化电量数据
		t.Charge();
		t.Switch(true);
	}
}

class Torch
{
		//定义构造函数
		Torch(int i)
		{
			this.Energe = i; //初始化电量
		}
    public void Charge()
    {
    	System.out.println("I am charging!");
    	System.out.println("Energe:" + this.GetEnergeLeft() + "\n");
    }
    
    public void Switch(boolean onoff)
    {
      if(true == onoff)
      {
      	System.out.printf("Turn on the Torch!\n");
      }
      else
      {
      	System.out.printf("Turn off the Torch!\n");
      }
    }
    
    private int GetEnergeLeft() //内部私有方法，只能在类的内部调用
    {
    	return this.Energe;
    }
    
    private int Energe; //电量
}
