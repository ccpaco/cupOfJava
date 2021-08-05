package cs1102;
import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	void addButton(JPanel buttons, String label)
	{
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}
	
	public TrueFalseQuestion(String question, String answer) 
	{
		super(question); // calls the Question constructor 
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		
		initQuestionDialog();
		
		this.correctAnswer = answer;
		
	}

}
