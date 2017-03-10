package com.ethan.advanced;
import java.io.*;
import java.util.*;;

public class Test_IO
{
	public static void main(String[] args){
		IO io = new IO();
		//sc用于从屏幕读取输入
		Scanner sc = new Scanner(System.in);
		String file = "io_test.txt";
		String name = null;
		
		System.out.println("please type in your name");
		name = sc.nextLine();
		String str_out = null;
		io.Write(file, name);
		io.Reade(file, str_out);
		//关闭sc
		sc.close();
	}
}
class IO 
{
	public void Reade(String filename, String str)
	{
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			str = br.readLine();
			
			while(str != null){
				System.out.println(str);
				str = br.readLine();
			}
			br.close();
			
		}
		catch(IOException e){
			System.out.println("IO Problem");
		}
		finally{
			System.out.println("Reade finally!");
		}
	}
	
	public void Write(String filename, String str)
	{
		try{
			 File file = new File(filename);
			 if(!file.exists()){
				 file.createNewFile();
			 }
			 
			 FileWriter fw = new FileWriter(file.getAbsolutePath());
			 BufferedWriter bw = new BufferedWriter(fw);
			 bw.write(str);
			 bw.close();
		}
		catch(IOException e){
			System.out.println("IO problem!");
		}
		finally{
			System.out.println("Write finally!");
		}
	}
}
