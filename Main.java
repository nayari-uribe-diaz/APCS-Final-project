import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ArrayList;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	  {
		  Animal spirit = new Animal("", "", "", "");
		 
		ArrayList<Integer> ans = new ArrayList<Integer>();
		primaryStage.setTitle("Question 1:");
		//first question	
		Questions round1 = new Questions("Do you like blue or green?", "blue", "green");
		Label labelFirst= new Label(round1.getQ());
		Label labelResponse= new Label();
		Button button = new Button("Next");

		RadioButton radio1, radio2;
		radio1 = new RadioButton(round1.getResponse1());
		radio2 = new RadioButton(round1.getResponse2());

		ToggleGroup question1= new ToggleGroup();

		radio1.setToggleGroup(question1);
		radio2.setToggleGroup(question1);

		radio1.setOnAction(e -> button.setDisable(false) );
		radio2.setOnAction(e -> button.setDisable(false) );

		button.setDisable(false);

		VBox layout= new VBox(5);

		layout.getChildren().addAll(labelFirst, radio1, radio2, button, labelResponse);
				
		Scene scene1= new Scene(layout, 500, 300);
		primaryStage.setScene(scene1);
		primaryStage.show();

		//second question
		Questions round2 = new Questions("Are you a vegetarian?", "yes", "no" );
		Label label2 = new Label(round2.getQ());
		Button button2= new Button("Next");
		
		RadioButton radio3, radio4;
		radio3 = new RadioButton(round2.getResponse1());
		radio4 = new RadioButton(round2.getResponse2());

		ToggleGroup question2= new ToggleGroup();

		radio3.setToggleGroup(question2);
		radio4.setToggleGroup(question2);

		button2.setDisable(true);

		radio3.setOnAction(e -> button2.setDisable(false) );
		radio4.setOnAction(e -> button2.setDisable(false) );
		VBox layout2 = new VBox(5);

		layout2.getChildren().addAll(label2, radio3, radio4, button2, labelResponse);
				
		Scene scene2= new Scene(layout2, 500, 300);

		//third question
		Questions round3 = new Questions("What is your temperment?", "calm, timid or happy", "energetic, confident or bold");
		Label label3 = new Label(round3.getQ());
		Button button3= new Button("Next");
		
		RadioButton radio5, radio6;
		radio5 = new RadioButton(round3.getResponse1());
		radio6 = new RadioButton(round3.getResponse2());

		ToggleGroup question3= new ToggleGroup();

		radio5.setToggleGroup(question3);
		radio6.setToggleGroup(question3);

		button3.setDisable(true);

		radio5.setOnAction(e -> button3.setDisable(false) );
		radio6.setOnAction(e -> button3.setDisable(false) );
		
		VBox layout3 = new VBox(5);

		layout3.getChildren().addAll(label3, radio5, radio6, button3, labelResponse);
				
		Scene scene3= new Scene(layout3, 500, 300);

		//fourth questionLabel 
		Questions round4 = new Questions("Are  you an introvert or extrovert?", "introvert", "extrovert");
		Label label4 = new Label(round4.getQ());
		Button button4= new Button("Next");
		
		RadioButton radio7, radio8;
		radio7 = new RadioButton(round4.getResponse1());
		radio8 = new RadioButton(round4.getResponse2());

		ToggleGroup question4= new ToggleGroup();

		radio7.setToggleGroup(question4);
		radio8.setToggleGroup(question4);

		button4.setDisable(true);

		radio7.setOnAction(e -> button4.setDisable(false) );
		radio8.setOnAction(e -> button4.setDisable(false) );
		
		VBox layout4 = new VBox(5);

		layout4.getChildren().addAll(label4, radio7, radio8, button4, labelResponse);
				
		Scene scene4= new Scene(layout4, 500, 300);

		//fifth question 
		Questions round5 = new Questions("Do you prefer summer or winter?", "summer", "winter" );
		Label label5 = new Label(round5.getQ());
		Button button5= new Button("Next");
		RadioButton radio9, radio10;
		radio9 = new RadioButton(round5.getResponse1());
		radio10 = new RadioButton(round5.getResponse2());

		ToggleGroup question5= new ToggleGroup();

		radio9.setToggleGroup(question5);
		radio10.setToggleGroup(question5);

		button5.setDisable(true);

		radio9.setOnAction(e -> button5.setDisable(false) );
		radio10.setOnAction(e -> button5.setDisable(false) );
		
		VBox layout5 = new VBox(5);

		layout5.getChildren().addAll(label5, radio9, radio10, button5, labelResponse);
				
		Scene scene5= new Scene(layout5, 500, 300);
	
	//finale
				
		Label label6 = new Label();
		Label labelResponse6= new Label();
		Button button6 = new Button("Yes");
		Button button7 = new Button("No");
				
		VBox layout6 = new VBox(5);

		layout6.getChildren().addAll(label6,  button6, button7, labelResponse6);
						
		Scene scene6= new Scene(layout6, 500, 300);				
// scene7
				
		Label label7 = new Label("Your spirit animal is");
		Label end = new Label ("");
		
		VBox layout7 = new VBox(5);

		layout7.getChildren().addAll(label7, end, labelResponse);
				
		Scene scene7= new Scene(layout7, 500, 300);
//scene 8

		Label label8 = new Label("Thanks for participating!");
		VBox layout8 = new VBox(5);

		layout8.getChildren().addAll(label8, labelResponse);
				
		Scene scene8= new Scene(layout8, 500, 300);

		//question 1
		button.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{	
				
				if (radio1.isSelected())
				{
					round1.setAnswer("blue");
					spirit.setHabitat("Water");
					button.setDisable(true);
					ans.add(round1.getResponseNum());
				}
		   
				else
				{
					round1.setAnswer("green"); 
					spirit.setHabitat("land");
					button.setDisable(true);
					ans.add(round1.getResponseNum());
				}
				
				primaryStage.setScene(scene2);
				primaryStage.show();
				primaryStage.setTitle("Question 2:");
				
			}
		});
		
			
		//question 2
		button2.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{	
				if (radio3.isSelected())
				{
					round2.setAnswer("yes");
					spirit.setDiet("herbivore");
					button2.setDisable(true);	
					ans.add(round2.getResponseNum());
				}
				else
				{
					round2.setAnswer("no"); 
					spirit.setDiet("onmivore");	
					button2.setDisable(true);
					ans.add(round2.getResponseNum());
				}
				
				primaryStage.setScene(scene3);
				primaryStage.show();
				primaryStage.setTitle("Question 3:");
			
			}
		  });		
			
		//question 3
		button3.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{
				if (radio5.isSelected())
				{
					round3.setAnswer("calm, timid or happy");
					spirit.setTemper("prey");
					button3.setDisable(true);
					ans.add(round3.getResponseNum());
				}
		   
				else
				{
					round3.setAnswer("energetic, confident or bold");
					spirit.setTemper("predator");
					button3.setDisable(true);
					ans.add(round3.getResponseNum());
				}
					
				primaryStage.setScene(scene4);
				primaryStage.show();
				primaryStage.setTitle("Question 4:");
				 
			}
		});

		//question 4
		button4.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{
				if (radio7.isSelected())
				{
					round4.setAnswer("introvert");
					spirit.setSocial("introvert");
					button4.setDisable(true);
					ans.add(round4.getResponseNum());
				}
		   
				else
				{
					round4.setAnswer("extrovert"); 
					button4.setDisable(true);
					spirit.setSocial("extrovert");
					ans.add(round4.getResponseNum());
				}
					
				primaryStage.setScene(scene5);
				primaryStage.show();
				primaryStage.setTitle("Question 5:");
				 
			}
		});
		
		//question 5
		button5.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{
					
				if (radio9.isSelected())
				{
					round5.setAnswer("summer");
					spirit.setClimate("warmer climate");
					button5.setDisable(true);
					ans.add(round5.getResponseNum());
				}
		   
				else
				{
					round5.setAnswer("winter"); 
					spirit.setClimate("colder climate");
					button5.setDisable(true);
					ans.add(round5.getResponseNum());
				}
				//" to string "
				String l;
				String m;
				String n;
				String o;
				String p;
			//question 1
			if(ans.get(0) == 0)
				{
					l = ("Your spirit animal is likely to be an ocean animal,");
				}
				else
				{
					l = ("You are likely to be a land animal,");
				}
			//question 2	
			if(ans.get(1) == 0)
			{
				 m= (" who is an herbivore");
			}
			else
			{
				 m= (" who is an omnivore");
			}
			//question 3
			if(ans.get(2) == 0)
			{
				 n = (", and prey.");
			}
			else
			{
				 n= (", and a predator.");
			}
			//question 4
			if(ans.get(3) == 0)
			{
				 o = ("\nYou are also likely to be a loner, ");
			}
			else
			{
				o= ("\n You are also likely to be a pack animal, ");
			}
			//question 5
			 if(ans.get(4) == 0)
			 {
				 p = ("who lives in a warmer climate.");
			 }
			 else
			 {
				 p = ("who lives in a colder climate.");
			 }
				String h= l + m+ n+ o +p;
				label6.setText(h + "\nWould you like to know your specific spirit animal?");
					
				primaryStage.setScene(scene6);
				primaryStage.show();
				primaryStage.setTitle("Part 1 Finale");
				 
			}
		});
		
		button6.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{
					if(spirit.getHabitat().equals("land"))
					{
						LandAnimal landSpirit = new LandAnimal(spirit.getDiet(), spirit.getTemper(), spirit.getSocial(), spirit.getClimate());
						end.setText(landSpirit.setLAnimal());
					}
					else
					{
						WaterAnimal waterSpirit= new WaterAnimal(spirit.getDiet(), spirit.getTemper(), spirit.getSocial(), spirit.getClimate());
						end.setText(waterSpirit.setWAnimal());
					}
		
				primaryStage.setScene(scene7);
				primaryStage.show();
				
				primaryStage.setTitle("Your spirit animal:");
				 
			}
		});
		button7.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e)
			{
					
				primaryStage.setScene(scene8);
				primaryStage.show();
				primaryStage.setTitle("Thanks!");
				 
			}
		});
	  }	
	
public static void main(String[] args) 
	{
		launch(args);
	}
}