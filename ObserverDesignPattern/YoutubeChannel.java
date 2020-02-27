package ObserverDesignPattern;

import java.util.ArrayList;

public class YoutubeChannel {
	
	ArrayList<IObserver> observer= new ArrayList<IObserver>();
	
	public YoutubeChannel()
	{
		
	}
	
	public void uploadVideo()
	{
		System.out.println("video has been uopladed");
		sendNotification();
	}
	
	public void subscribe(IObserver iob)
	{
		observer.add(iob);
	}
	
	public void unsubscribe(IObserver iob)
	{
		observer.remove(iob);
	}
	
	public void sendNotification()
	{
		for(IObserver obs: observer)
		{
			obs.getNotification();
			
		}
	}

}
