package Week2Assignmets;

public class RemoveDup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "We learn java basics as part of java sessions in java week1";
		int num = 0;
		String[] word = ab.split(" ");
		for(int i=0;i<word.length;i++) {
			num++;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					num++;
					word[j]="";
				}
			}
			if(num>=1) {
				System.out.print(word[i]+" ");
			}
		}
	}


}
