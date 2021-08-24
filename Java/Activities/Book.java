package activities;

//Abstract class
abstract class Book {
  String booktitle;
  //Abstract method
  abstract void setTitle(String s);
  
  //Concrete method
  String getTitle() {
      return booktitle;
  }

}