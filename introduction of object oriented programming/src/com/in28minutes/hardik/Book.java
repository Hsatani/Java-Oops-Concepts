package com.in28minutes.hardik;

public class Book {
	
	   private int nosofcopies;  //member variable
	   
	public void setnosofcopies (int nosofcopies) { //local variable
		if (nosofcopies > 0)
		this.nosofcopies = nosofcopies;
			
	}
	public int getnosofcopies() {
	return nosofcopies;
	}
 
	public void incresenosofcopies(int howmuch) {
		setnosofcopies(this.nosofcopies + howmuch);
		
	}
	
	public void decresenosofcopies(int howmuch) {
		setnosofcopies(this.nosofcopies + howmuch);
		
	}
	
       void read() {
    	   System.out.println("Book read");
    	   }
}
