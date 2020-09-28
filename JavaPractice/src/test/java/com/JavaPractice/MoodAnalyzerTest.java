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
	public void WhenGivenHappy_ReturnsHappy() {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("Happy");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Happy",mood);
	}
//Sad
	@Test
	public void WhenGivenSad_ReturnsSad() {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("Sad");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Sad",mood);
	}
	@Test
	public void WhenSadInMsg_ReturnsSad() {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("Sad");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Sad",mood);
	}
	
	@Test
	public void WhenGivenAnyMessage_ReturnsHappy() {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer("I am in Any mood !");
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Happy",mood);
	}
	@Test
	public void WhenGivenNULL_ReturnsHappy() {
		MoodAnalyzer moodAnalyser=new MoodAnalyzer();
		String mood=moodAnalyser.checkMood();
		org.junit.Assert.assertEquals("Happy",mood);
	}
	
}
