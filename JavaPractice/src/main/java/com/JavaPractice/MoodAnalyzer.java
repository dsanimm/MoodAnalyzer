package com.JavaPractice;

public class MoodAnalyzer {
	public String msg;
	public MoodAnalyzer() {
		
	}
	public MoodAnalyzer(String msg) {
	this.msg=msg;	
	}
	public String checkMood() {
		try{
			if (this.msg=="Happy")
		
			return "Happy";
		else if(this.msg.contains("Sad"))
			return "Sad";
		else if(this.msg.contains("Happy"))
			return "Happy";
		else
			return "Happy";}
		catch(NullPointerException e){
			return "Happy";
		}
	}


}
