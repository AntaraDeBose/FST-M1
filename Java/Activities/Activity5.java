package activities;

public class Activity5 {

	public static void main(String[] args) {
		
		  class MyBook extends Book {
			    //Define abstract method
			    public void setTitle(String s) {
			        booktitle = s;
			    }
			}
		     //Initialize title of the book
	        String title = "Hover Car Racer";
	        //Create object for MyBook
	        Book newNovel = new MyBook();
	        //Set title
	        newNovel.setTitle(title);
	        
	        //Print result
	        System.out.println("The title is: " + newNovel.getTitle());
	    }

	}


