public class LandAnimal extends Animal
{
	
	public LandAnimal (String d, String t, String s, String c)
	{
		super(d, t, s, c);
	}
	
	
	public String setLAnimal()
	{
		String nayari = "";
		System.out.println(this.getDiet());
		if(this.getDiet().equals("omnivore"))
		{
			if(this.getTemper().equals("prey"))
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						return (" A Kangaroo rat");
					}
					else// omnivore, prey, introvert, colder climate
					{
						nayari = ("An Ermine");
					}
				}
				else// omnivore, prey, extrovert, 
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("A Mouse");
					}
					else// omnivore, prey, extrovert, colder 
					{
						nayari = ("A Fox");
					}
				}
			}
			else//predatore, omivore,
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("A Brown Bear");
					}
					else// predatore, omnivore, introvert, colder
					{
						nayari = ("A Polar Bear");
					}
				}
				else// predatore, omnivore, extrovert
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("A Lion");
					}
					else// predatore, omnivore, extrovert, colder
					{
						nayari = ("A Sabertooth Tiger");
					}
				}
			}
		} 
		else
		{
			if(this.getTemper().equals("prey"))//hervbivore prey
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("A Camel");
					}
					else// herbivore, prey, inrovert, colder
					{
						nayari = ("A Puffin");
					}
				}
				else// herbivore, prey, extrovert 
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("A Meerkat" );
					}
					else// herbivore, prey, extrovert, colder
					{
						nayari = ("A Penguin");
					}
				}
			}
			else // predator, herbivore
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("A Rhino");
					}
					else // predator, herbiore, intorvert, colder
					{
						nayari = ("A Mountain Goat");
					}
				}
				else// extorvert, predator, herbivore
				{
					if(this.getClimate().equals("warmer climate"))
					{
						nayari = ("An Armadillo");
					}
					else// extrovert, predator, herbivore, colder 
					{
						nayari = ("A Macaque");
					}
				}
			}
			
		}
		return nayari;
	}
}

