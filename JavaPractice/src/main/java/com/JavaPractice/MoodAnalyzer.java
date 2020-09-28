package com.JavaPractice;
import com.JavaPractice.InvalidMood.ExceptionType;
public class MoodAnalyzer {
	public String msg;
	public MoodAnalyzer() {
		
	}
	public MoodAnalyzer(String msg) {
	this.msg=msg;	
	}
	public String checkMood() throws InvalidMood {
		try{
			if(msg.length()==0)
				throw new InvalidMood(InvalidMood.ExceptionType.Entered_Empty, "Enter A Valid Mood");
			
		if(this.msg.contains("Sad"))
			return "Sad";
		else 
			return "Happy";
		}
		catch(NullPointerException e){
			throw new InvalidMood(InvalidMood.ExceptionType.Entered_Null, "Enter A Valid Mood");

		}
	}


}

