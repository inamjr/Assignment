import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import Assign.EvaluationService;
import junit.framework.Assert;

public class EvaluationServiseTester {

	@Test
	public void test1() {
		EvaluationService q = new EvaluationService();
		String q1 = q.reverse("Hello world");
		
		Assert.assertEquals("dlrow olleH", q1);
			
	}

	
	
	@Test
	public void test2Acronym() {
		EvaluationService q = new EvaluationService();
		String q1 = q.acronym("Tony Boy");
		
		Assert.assertEquals("TB", q1);
	}
	
	@Test 
	public void test3Scalene() {
		
		 EvaluationService.Triangle q = new EvaluationService.Triangle(1.11,2.11,4.11);
		 boolean q1 =q.isScalene();
		  Assert.assertEquals(true, q1);
		  
	}
	
	@Test
	public void test4Isosceles() {
		
		EvaluationService.Triangle q = new  EvaluationService.Triangle(1.11,2.11,1.11);
		boolean q1 = q.isIsosceles();
		Assert.assertEquals(true, q1);
		}
	
	@Test
	public void test5Equilateral() {
		EvaluationService.Triangle q = new EvaluationService.Triangle(1.11,1.11,1.11);
		boolean q1 = q.isEquilateral();
		Assert.assertEquals(true, q1);
	} 
	@Test 
	public void test6Scrable() {
		EvaluationService q = new EvaluationService();
		int q1 = q.getScrabbleScore("cabbage");
		Assert.assertEquals(14, q1);
	}
	@Test
	public void test8CleanPhoneNumber() {
		EvaluationService q = new EvaluationService();
		String q1 = q.cleanPhoneNumber("+1 (613)-995-0253");
		Assert.assertEquals("6139950253", q1);
	
	}
	@Test
	public void test9Wordcounter() {
		EvaluationService q = new EvaluationService();
		
		Map<String, Integer> q1 = q.wordCount("olly olly in come free");
		Map<String,Integer> qq1= new HashMap<String,Integer>();
		qq1.put("olly", 2);
		qq1.put("in", 1);
		qq1.put("come", 1);
		qq1.put("free", 1);
		Assert.assertEquals(qq1, q1);
	}
	
	@Test
	public void test10PigLatin() {
		EvaluationService q = new EvaluationService();
		String q1 = q.toPigLatin("ARE");
		Assert.assertEquals("AREAY", "AREAY");
	}
	
	@Test
	public void test11Armstrongnumber() {
		EvaluationService q = new EvaluationService();
		boolean q1 = q.isArmstrongNumber(153);
		Assert.assertEquals(true, q1);
	}
	@Test
	public void test12primefactor() {
		EvaluationService q = new EvaluationService();
		long q1 = q.calculatePrimeFactorsOf(9);
		Assert.assertEquals(9, q1);
	}
	@Test
	public void test13CeaserCipher() {
		EvaluationService.RotationalCipher q = new EvaluationService.RotationalCipher(2);
		String q1 = q.rotate("HOW");
		Assert.assertEquals("IPX", q1);
	
}
	@Test
	public void test14Primenum() {
		EvaluationService q= new EvaluationService();
		int q1 = q.calculateNthPrime(6);
		Assert.assertEquals(13, q1);
	}
	@Test
	public void test15encoding() {
		EvaluationService.AtbashCipher q= new EvaluationService.AtbashCipher();
		String q1 = q.encode("aaa");
		Assert.assertEquals("zzz", q1);
	}
	@Test
	public void test16decoding() {
		EvaluationService.AtbashCipher q= new EvaluationService.AtbashCipher();
		String q1 = q.decode("zzz");
		Assert.assertEquals("aaa", q1);
	}
	@Test
	public void test16PanGram() {
		EvaluationService q = new EvaluationService();
		boolean q1 = q.isPangram("The quick brown fox jumps over the lazy dog");
		Assert.assertEquals(true, q1);
	}
	@Test
	public void test18uniqeMultiple() {
		EvaluationService q = new EvaluationService();
		int q1 = q.getSumOfMultiples(20);
		Assert.assertEquals(78, q1);
	}
	@Test
	public void test19luhnValidation() {
		EvaluationService q = new EvaluationService();
		boolean q1 = q.isLuhnValid("1 4539 1488 0343 6467");
		Assert.assertEquals(true,q1);
	}
	@Test
	public void test20StringCalc() {
		EvaluationService q = new EvaluationService();
		int q1 = q.solveWordProblem("What is 25 divided by 5?");
		Assert.assertEquals(5,q1);
	}
	
	}
