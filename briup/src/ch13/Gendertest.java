package ch13;

public class Gendertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gender gender=new Gender();
		Gender gender=Gender.MALE;
		Gender g1=Gender.valueOf("FEMALE");
		Gender[] gs=Gender.values();
		for(Gender gg:gs){
			System.out.print(gg+"    ");
		}
		System.out.println();
		System.out.println(gender.name()+gender.ordinal());
		System.out.println();
		System.out.println(gender);
		System.out.println(g1);
		System.out.println(Gender.values());
	}

}
