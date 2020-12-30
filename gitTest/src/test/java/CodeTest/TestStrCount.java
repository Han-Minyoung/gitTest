package CodeTest;

import org.junit.Test;

public class TestStrCount {
	
	@Test
	public void countTest() {
		String str="글자수 몇개 일까";
		String str2=str.replaceAll(" ", "");
		
		System.out.println("글자수는? "+str.length());
		System.out.println("공백 빼고 글자수는? "+str2.length());
	}

}
