import java.util.Observable;
import java.util.Observer;


/**
 * 
 */
public class WeatherData extends Observable
{
	private float wendu;

	private float shidu;

	private float tianqi;

	public WeatherData() {}


	public void pushOrPull()
	{
		this.setChanged();
		this.notifyObservers();
		// this.notifyObservers(Object);
	}



	/**
	 * When tianqi status changed, push or pull notify
	 * 
	 * @param wendu  [description]
	 * @param shidu  [description]
	 * @param tianqi [description]
	 */
	public void setOptions(float wendu, float shidu, float tianqi)
	{
		this.wendu = wendu;
		this.shidu = shidu;
		this.tianqi = tianqi;

		this.pushOrPull();
	}

	public float getWendu()
	{
		return this.wendu;
	}


	public float getShidu()
	{
		return this.shidu;
	}


	public float getTianqi()
	{
		return this.tianqi;
	}
}