package ObserverDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeChannel utube=new YoutubeChannel();
		IObserver aob=new AccountObserver();
		IObserver sob=new SMSObserver();
		IObserver eob=new EmailObserver();
		
		utube.subscribe(aob);
		utube.subscribe(sob);
		utube.subscribe(eob);
		
		utube.uploadVideo();

	}

}
