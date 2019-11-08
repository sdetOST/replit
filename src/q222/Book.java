package q222;

public class Book{
	  //instance variables must be private
	  //only constants can be public
	  private String title ="";
	  private String author ="";
	  private String tableOfContents="";
	  private int nextPage = 1;
	  
	  public Book(String title, String author){
	    this.title=title;
	    this.author=author;
	  }
	  
	  public void addChapter(String title, int numberOfPages){
	    tableOfContents += "\n"+title+"..."+nextPage;
	    nextPage+=numberOfPages;
	  }
	  
	  public int getPages(){
	    return nextPage-1;
	  }
	  
	  public String getTableOfContents(){
	    return tableOfContents;
	  }
	  
	  public String toString(){
	    return title+"\n"+author;
	  }
}
	  