import java.util.Scanner;
import java.util.ArrayList;
public class Questions
  {
    private String question;
    private String response1;
	private String response2;
	private int responseNum;
	
  public Questions(String q, String r1, String r2)  
  {
	  question = q;
	  response1 = r1;
	  response2 = r2;
  }
	
	 public String getQ()
    {
      return (question);
    }
	
	public String getResponse1()
    {
      return (response1);
    }
	
	public String getResponse2()
    {
      return (response2);
    }
	
	 public void setAnswer(String a)
    {
      String answer = a;
	  if(answer.equals(response1))
	  {
		  responseNum = 0;
	  }
	  else
	  {
		  responseNum = 1;
	  }
    }
	
	public int getResponseNum()
	{
		return responseNum;
	}
  }
