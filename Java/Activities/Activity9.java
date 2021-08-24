package activities;
import java.util.ArrayList;
public class Activity9 {
	public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Rose");
        myList.add("Jasmine");
        myList.add("TubeRose");
        //Adding object at specific index
        myList.add(3, "Sunflower");
        myList.add(1, "Hibiscus");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Rose is in list: " + myList.contains("Rose"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Jasmine");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
