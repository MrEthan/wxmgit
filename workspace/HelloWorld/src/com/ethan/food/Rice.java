package com.ethan.food;

/**
 * @author xiaoming
 * �����ࣺ�����г��ֳ��󷽷�ʱ�������������������abstract�ؼ���
 */
abstract class Food{
	public abstract void eat(); //���󷽷�abstractֻ������ԭ�ͣ�����Ҫ���嶨�巽������ӿ����ơ��ڲ�ͬ�����п����в�ͬ��ʵ�֡�
	public void happyFood()
	{
		System.out.println("Good! eat me~");
	}
}
/*
 * �̳�����Food
 */
class Rice extends Food{
	//ʵ�ֳ��󷽷�eat
	public void eat()
	{
		System.out.println("eat Rice!");
	}
}

class Corn extends Food{
	public void eat()
	{
		System.out.println("eat Corn!");
	}
}
