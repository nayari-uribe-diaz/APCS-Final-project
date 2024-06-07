public class WaterAnimal extends Animal
{
		
		public WaterAnimal (String d, String t, String s, String c)
	{
		super(d, t, s, c);
	}
	
	public String setWAnimal()
	{
		String call = "";
		if(this.getDiet().equals("omnivore"))
		{
			if(this.getTemper().equals("prey"))
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Crab");
					}
					else// omnivore, prey, introvert, colder climate
					{
						call = ("An Atlantic Cod");
					}
				}
				else// omnivore, prey, extrovert, 
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Whale");
					}
					else// omnivore, prey, extrovert, colder 
					{
						call = ("A Penguin");
					}
				}
			}
			else//predatore, omivore,
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Shark");
					}
					else// predatore, omnivore, introvert, colder
					{
						call = ("A Polar bear");
					}
				}
				else// predatore, omnivore, extrovert
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Sea Lion");
					}
					else// predatore, omnivore, extrovert, colder
					{
						call = ("An Orca");
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
						call = ("A Sea Turtle");
					}
					else// herbivore, prey, introvert, colder
					{
						call = ("A Krill");
					}
				}
				else// herbivore, prey, extrovert 
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Marine Iguana");
					}
					else// herbivore, prey, extrovert, colder
					{
						call = ("A Sea Otter");
					}
				}
			}
			else // predator, herbivore
			{
				if(this.getSocial().equals("introvert"))
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Grouper Fish" );
					}
					else // predator, herbiore, intorvert, colder
					{
						call = ("An Angler Fish");
					}
				}
				else// extorvert, predator, herbivore
				{
					if(this.getClimate().equals("warmer climate"))
					{
						call = ("A Manatee");
					}
					else// extrovert, predator, herbivore, colder 
					{
						call = ("A Jellyfish");
					}
				}
			}
			
		}
		return call;
		
	}
}


