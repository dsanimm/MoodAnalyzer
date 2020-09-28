package com.JavaPractice;

public class MoodAnalyzer {
	
	
	public String checkMood(String msg) {
		if (msg=="Happy")
			return "Happy";
		if(msg.contains("Sad"))
			return "Sad";
		else
			return "Happy";
	}

}
