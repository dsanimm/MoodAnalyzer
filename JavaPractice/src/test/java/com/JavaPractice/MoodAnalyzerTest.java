package com.JavaPractice;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyzerTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	
	@Test
	public void WhenGivenHappy_ReturnsHappy() throws InvalidMood  {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("Happy");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Happy",mood);
	}
//Sad
	@Test
	public void WhenGivenSad_ReturnsSad() throws InvalidMood {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("Sad");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Sad",mood);
	}
	@Test
	public void WhenSadInMsg_ReturnsSad() throws InvalidMood {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("Sad");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Sad",mood);
	}
	
	@Test
	public void WhenGivenAnyMessage_ReturnsHappy() throws InvalidMood {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("I am in Any mood !");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Happy",mood);
	}
	
	@Test
	public void WhenGivenNullMessage_HandlesException_ReturnHappy() {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer();
		try {
			String mood = moodAnalyser.checkMood();
			org.junit.Assert.assertEquals("Happy",mood);
		} catch (InvalidMood e) {
			org.junit.Assert.assertEquals("Enter A Valid Mood",e.getMessage());
		}
	}
	
}
