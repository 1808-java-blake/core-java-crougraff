package com.revature.eval.java.core;

public class EvaluationLauncher {
	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();
//		es.acronym("Core Java");
//		Triangle t = new Triangle(0.5, 0.4, 0.6);
//		System.out.println(t.isEquilateral());
//		System.out.println(t.isIsosceles());
//		System.out.println(t.isScalene());
//		System.out.println(es.getScrabbleScore("f"));
//		System.out.println(es.cleanPhoneNumber("322395144841"));
		//System.out.println(es.wordCount("one,\ntwo,\nthree"));
		es.isArmstrongNumber(9);
	}
}
