package SingleTon;

public class HudaiSingleton {
	
	private static HudaiSingleton st=null;
	
	public static HudaiSingleton getInstance()
	{
		if(st==null)
		{
			synchronized(HudaiSingleton.class)
			{
				if(st==null)
				{
					st= new HudaiSingleton();
				}				
			}			
		}
		
		return st;
	}

}
