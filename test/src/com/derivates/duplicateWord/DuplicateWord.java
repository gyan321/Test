package com.derivates.duplicateWord;

public class DuplicateWord {

	public static void main(String[] args) {
		 String words =" I am a developer developer";
		 int count;
		words =words.toLowerCase();

		String word []= words.split(" ");
		System.out.println("duplicate word in the given string: ");
		for(int i=0;i<word.length;i++){
			count=1;
			for(int j=i+1;j<word.length;j++){
				if(word[i].equals(word[j])){
					count++;
					word[j]="0";
				}
			}
			
			if(count>1&&word[i]!="0"){
				System.out.println(word[i]);
			}
		}
		

	}

}
