package cn.edu.fjnu.hotelTest;

import java.util.Scanner;

import cn.edu.fjnu.hotelTest.InHotel;
import cn.edu.fjnu.hotelTest.ListHotel;
import cn.edu.fjnu.hotelTest.OutHotel;

public class MainRun {

	static IData iData=new DP();
	private static ListHotel lh=new ListHotel(iData);
	private static InHotel ih=new InHotel(iData);
	private static OutHotel oh=new OutHotel(iData);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iData.iniRooms();
		command();
	}

	private static void command()
	{
		String comm;
		while(true)
		{
			System.out.println("请输入命令：");
			Scanner scan=new Scanner(System.in);
			System.gc();
			comm=scan.next();
			if("search".equalsIgnoreCase(comm))
				lh.search();
			else if("in".equalsIgnoreCase(comm))
			{
				int roomNo=scan.nextInt();
				try {
					if(validRoomNo(roomNo))
					{
						String name=scan.next();
						System.out.println(ih.in(roomNo,name));
					}
					else
						System.out.println("房间号出错");		
				}catch(Exception e)
				{
					System.out.println("房间号错！");
				}
			}
			else if("out".equalsIgnoreCase(comm))
			{
				int roomNo=scan.nextInt();
				if(validRoomNo(roomNo))
					System.out.println(oh.out(roomNo));
				else
					System.out.println("房间号出错");
			}
			else if("exit".equalsIgnoreCase(comm))
			{
				System.out.println("程序退出...");
				break;
			}
			else
				System.out.println("命令输入错误，请重新输入：");
		}
		
	}
	private static boolean validRoomNo(int roomNo)
	{
		if((roomNo/100>10)||(roomNo/100<1)||(roomNo%100>12)||(roomNo%100<1))
			return false;
		else
			return true;
	}

}
