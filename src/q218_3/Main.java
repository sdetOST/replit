package q218;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book(1,"Aaaa","00A",100);
		Book b2 = new Book(2,"Bbbb","00B",200);
		Book b3 = new Book(3,"Cccc","00C",300);
		
		Shelf.addBook(b1);
		Shelf.addBook(b2);
		Shelf.addBook(b3);
		
		int i = Shelf.getTheBooks().indexOf(2);

		System.out.println(i);
	}

}
