package Week2Assignmets;

public class SumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Tes12Le79af65";
		int num=0;
		char[] character=word.toCharArray();
		for(int i=0;i<character.length;i++) {
			char charValue=character[i];
			if(Character.isDigit(charValue)) {
					int a=Character.getNumericValue(charValue);
					num=num+a;
			}
		}
		System.out.println("sum =  "+ num);
	}

}
