public class Excercise_String {	
	
	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog";
		
		System.out.println("character at the 12th index : "+str.charAt(12));
		
		System.out.println("----------------");
		
		if(str.contains("is"))
			System.out.println("String contains the word 'is'");
		else			
			System.out.println("String does not contains the word 'is'");
		
		System.out.println("----------------");
		
		String strcon=str.concat(" and killed it");
		System.out.println("Concatenated String : "+strcon);
		
		System.out.println("----------------");
		
		String[] strarr= str.split(" ");
		if(strarr[strarr.length-1].equalsIgnoreCase("dogs"))
			System.out.println("String ends with the word “dogs”");
		else
			System.out.println("String doesnt end with the word “dogs”");
		
		System.out.println("----------------");
		
		
		String str1="The quick brown Fox jumps over the lazy Dog";
		if(str.equals(str1))
			System.out.println("The String is equal to “The quick brown Fox jumps over the lazy Dog”");
		else
			System.out.println("The String is not equal to “The quick brown Fox jumps over the lazy Dog”");
		
		System.out.println("----------------");
		
		String str2="QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		if(str.equals(str2))
			System.out.println("The String is equal to “QUICK BROWN FOX JUMPS OVER THE LAZY DOG”");
		else
			System.out.println("The String is not equal to “QUICK BROWN FOX JUMPS OVER THE LAZY DOG”");
	
		System.out.println("----------------");
		
		if(str.matches(str1))
			System.out.println("The String  macthes “The quick brown Fox jumps over the lazy Dog”");
		else
			System.out.println("The String doesnt match with “The quick brown Fox jumps over the lazy Dog”");
		
		System.out.println("----------------");
		
		System.out.println("String Length = "+str.length());
		
		System.out.println("----------------");
		
		String strreplace=str.replaceAll("The", "A");
		System.out.println("New String : "+strreplace);
		
		System.out.println("----------------");
		
		//Split the above string into two such that two animal names do not come together
		int i=str.indexOf("fox");
		str1=str.substring(0, i+3);
		str2=str.substring(i+4);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("----------------");
		
		//Print the animal names alone separately from the above string. 
		str1=str.substring(i,i+3);
		int j=str.indexOf("dog");
		str2=str.substring(j, j+3);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("----------------");
		
		
		System.out.println("String in lowercase : "+str.toLowerCase());
		System.out.println("String in uppercase : "+str.toUpperCase());
		
		System.out.println("----------------");
		
		System.out.println("index position of the character “a” : "+ str.indexOf('a'));
		System.out.println("last index position of the character “e” : "+str.lastIndexOf('e'));
		
		
	}

}