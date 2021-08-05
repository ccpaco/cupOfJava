package cs1102;

public class Quiz {
	
	public static void main(String[] args) {
		
		Question question = new MultipleChoiceQuestion(
			"What is a question? Type a Letter A, B, C, D, or E.\n",
			"Something you answer\n",
			"Something you ask\n",
			"Something that tests you\n",
			"Something you learn from\n",
			"This is the correct answer\n",
			"e"
		);
		
		Question questionB = new MultipleChoiceQuestion(
			"How fun is Java? Type a Letter A, B, C, D, or E.\n",
			"Not fun \n",
			"Boring \n",
			"Fun if you make it fun \n",
			"More fun than Disneyland \n",
			"Error: Computer Scientists don't have fun \n",
			"c"
		);
		
		Question questionC = new MultipleChoiceQuestion(
			"What coding language do you prefer? Type a Letter A, B, C, D, or E.\n",
			"JavaScript \n",
			"Python \n",
			"C# \n",
			"Java \n",
			"Morse Code \n",
			"b"
				
		);
		
		Question questionD = new MultipleChoiceQuestion(
			"What dogs are the best dogs? Type a Letter A, B, C, D, or E.\n",
			"Shitzu \n",
			"Pitbull \n",
			"Wiener dog\n",
			"Hot dog\n",
			"Cats are the best! \n",
			"d"	
		);
		
		Question questionE = new MultipleChoiceQuestion(
			"What do you think of Object Oriented Programming? Type a Letter A, B, C, D, or E.\n",
			"Really hard \n",
			"Easy \n",
			"It requires effort \n",
			"Too tired to think \n",
			"#.# Cannot compute #.# \n",
			"a"	
		);
		
		Question questionF = new TrueFalseQuestion("Cats walk on four legs, True or False?", "TRUE");
		Question questionG = new TrueFalseQuestion("Dogs walk on four legs, True or False?", "TRUE");
		Question questionH = new TrueFalseQuestion("Humans walk on four legs, True or False?", "TRUE");
		Question questionI = new TrueFalseQuestion("Fish walk on four legs, True or False?", "FALSE"); 
		Question questionJ = new TrueFalseQuestion("Robots walk on four legs, True or False?", "TRUE");
		
//	    Quiz logic
		question.check(); //ask question, correct Answer is A
		questionB.check();
		questionC.check();
		questionD.check();
		questionE.check();
		questionF.check();
		questionG.check();
		questionH.check();
		questionI.check();
		questionJ.check();
		
		
		// Static class method by accessing class MultipleChoiceQuestion
		MultipleChoiceQuestion.showResults();
		
	}

}
