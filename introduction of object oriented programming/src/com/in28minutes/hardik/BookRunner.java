package com.in28minutes.hardik;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Book artOfComputerProgramming = new Book();
             Book effectiveJava = new Book();
             Book cleanCode = new Book();
             
            artOfComputerProgramming.read();
            effectiveJava.read();
            cleanCode.read();
             
             
            artOfComputerProgramming.setnosofcopies(10);
            effectiveJava.setnosofcopies(5);
            cleanCode.setnosofcopies(3);
             
             artOfComputerProgramming.incresenosofcopies(20);
             effectiveJava.incresenosofcopies(20);
             cleanCode.incresenosofcopies(20);
             
             
             
             
             System.out.println(artOfComputerProgramming.getnosofcopies());
            System.out.println(effectiveJava.getnosofcopies());        
            System.out.println(cleanCode.getnosofcopies());
	}

}
