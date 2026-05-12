package com.advance.java.day_20;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.advance.java.day_19.MoodAnalyser;
import com.advance.java.day_21.MoodAnalyser1;
import com.advance.java.day_21.MoodAnalysisException;



public class MoodAnalyserTest {
	 @Test
	    public void testMoodAnalysis() throws Exception {
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String mood = moodAnalyser.analyseMood("This is a SAD message");
	        Assert.assertEquals(mood, "SAD");
	    }

	    @Test // tc 1.1
	    public void givenMeassage_ISIAmSadMood_ShouldReturnSad() throws MoodAnalysisException {
	        MoodAnalyser1 moodAnalyser1 = new MoodAnalyser1("This is a SAD message");
	        String mood = moodAnalyser1.analyseMood();
	        Assert.assertEquals(mood, "SAD");
	    }

	    @Test // tc 1.2
	    public void givenMessage_IAmInAnyMood_ShouldReturnHappy() throws MoodAnalysisException {
	        MoodAnalyser1 moodAnalyser1 = new MoodAnalyser1("I am in any mood");
	        String mood = moodAnalyser1.analyseMood();
	        Assert.assertEquals(mood, "HAPPY");
	    }

	    @Test // tc 3.1
	    public void givenNull_Mood_ShouldMoodAnalysisException() {
	        MoodAnalyser1 moodAnalyser1 = new MoodAnalyser1(null);
	        try {
	            moodAnalyser1.analyseMood();
	        } catch (MoodAnalysisException e) {
	            Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL, e.type);
	        }
	    }

	    @Test // tc 3.2
	    public void givenEmpty_Mood_ShouldMoodAnalysisException() {
	        MoodAnalyser1 moodAnalyser1 = new MoodAnalyser1("");
	        try {
	            moodAnalyser1.analyseMood();
	        } catch (MoodAnalysisException e) {
	            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY, e.type);
	        }
	    }

}
