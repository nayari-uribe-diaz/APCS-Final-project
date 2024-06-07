public class Animal
{
	private String habitat;
	private String diet;
	private String social;
	private String climate;
	private String temper;
	
	public Animal(String h, String d, String t, String s, String c)
	{
		habitat= h;
		diet = d;
		temper = t;
		social = s;
		climate =c;
	}
	public Animal(String d, String t, String s, String c)
	{	diet = d;
		temper = t;
		social = s;
		climate =c;
	}
	
	public String getHabitat()
	{
		return habitat;
	}
	public void setHabitat(String h)
	{
		habitat = h;
	}
	
	public void setDiet(String d)
	{
		diet = d;
	}
	
	public void setTemper(String t)
	{
		temper =t;
	}
	
	public void setSocial(String s)
	{
		social =s;
	}
	
	public void setClimate(String c)
	{
		climate =c;
	}
	
	public String getDiet()
	{
			return diet;
	}
	
	public String getTemper()
	{
			return temper;
	}
	public String getSocial()
	{
			return social;
	}
	
	public String getClimate()
	{
			return climate;
	}
}