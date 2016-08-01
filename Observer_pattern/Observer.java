public interface Observer
{

	/**
	 * update observer
	 * 
	 * @param temp     wendu
	 * @param humidity shidu
	 * @param pressure tianqi
	 */
	public void update(float temp, float humidity, float pressure);
}