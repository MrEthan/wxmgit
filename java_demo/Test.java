/**
��ͳ���
*/

public class Test
{
	public static void main(String[] args)
	{
		Torch t = new Torch(99); //������ʱ�����ù��캯����ʼ����������
		t.Charge();
		t.Switch(true);
	}
}

class Torch
{
		//���幹�캯��
		Torch(int i)
		{
			this.Energe = i; //��ʼ������
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
    
    private int GetEnergeLeft() //�ڲ�˽�з�����ֻ��������ڲ�����
    {
    	return this.Energe;
    }
    
    private int Energe; //����
}
