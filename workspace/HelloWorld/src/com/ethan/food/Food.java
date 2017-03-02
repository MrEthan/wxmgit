package com.ethan.food;

/**
 * @author xiaoming
 * 抽象类：当类中出现抽象方法时，这个类的声明必须加上abstract关键字
 */
abstract class Food{
	public abstract void eat(); //抽象方法abstract只需声明原型，不需要具体定义方法，与接口类似。在不同的类中可以有不同的实现。
	public void happyFood()
	{
		System.out.println("Good! eat me~");
	}
}
/*
 * 继承自类Food
 */
class Rice extends Food{
	//实现抽象方法eat
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
