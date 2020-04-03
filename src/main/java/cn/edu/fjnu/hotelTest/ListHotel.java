package cn.edu.fjnu.hotelTest;
public class ListHotel {
	IData iData;
public ListHotel(IData iData)
{
	this.iData=iData;
}
public ListHotel()
{
	
}
public void search()
{
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<12;j++)
		{
			if(j+1<10)
			{
				System.out.print(i+1+"0"+(j+1)+"\t");
			}
			else
				System.out.print(i+1+""+(j+1)+"\t");
		}
		System.out.println();
		for(int j=0;j<12;j++)
		{
			System.out.print(iData.getStation((i+1)*100+j+1)+"\t");	
		}
		System.out.println();
	}
	
}
}

