import java.util.*;

public class WeatherData implements Subject
{

	private ArrayList observer;

	private float wendu;

	private float shidu;
	
	private float tianqi;


	public WeatherData()
	{
		this.observer = new ArrayList();
	}


	public void notifyObserver()
	{
		for (int i = 0; i < this.observer.size() ; i++) {
			Observer ob = (Observer) this.observer.get(i);
			ob.update(this.wendu, this.shidu, this.tianqi);
		}
	}


	public void regirstObserver(Observer observer)
	{
		this.observer.add(observer);
	}


	public void removeObserver(Observer observer)
	{
		int i = this.observer.indexOf(observer);

		if (i > 0) {
			this.observer.remove(observer);
		}
	}


	public void setOptions(float wendu, float shidu, float tianqi)
	{
		this.wendu = wendu;
		this.shidu = shidu;
		this.tianqi = tianqi;

		this.notifyObserver();
	}
}