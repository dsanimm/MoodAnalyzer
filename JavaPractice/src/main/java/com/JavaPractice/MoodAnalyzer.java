package com.JavaPractice;

public class MoodAnalyzer {
	
	
	public String checkMood(String msg) {
		if (msg=="Happy")
			return "Happy";
		else if(msg.contains("Sad"))
			return "Sad";
		else if(msg.contains("Happy"))
			return "Happy";
		else
			return "Happy";
	}

}
