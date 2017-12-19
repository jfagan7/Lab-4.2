package csv;

public class Store {

	private String city;
	private String name;
	private String address;
	private String state;
	private String primary;

	public Store(String name, String address, String city, String state,String primary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		this.city=city;
		this.state=state;
		this.primary=primary;
	}
	public String getStoreName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPrimary()
	{
		return primary;
	}
}
