package com.gym.javap.Immutable;

public class ImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable immu = Immutable.createInstance("abc", "xyz",  123);
		System.out.println("First  :: "+immu);
		tryModification(immu.getEmpId(), immu.getFirstName(), immu.getLastName());
		System.out.println("After Try to Modify :::  "+ immu);
		
	}

	private static void tryModification(int empI, String firstNm, String lastNm)
    {
		empI = 234;
        firstNm = "abcde";
        lastNm = "efgh";
    }
	
}
