package lab02;

public class Library{
	
	public static void main(String[] args){
		Book[] library = {new Book("Book1", 100), new Book("Book2", 500), new Book("Book3", 1000)};
		for(int i=0;i<library.length;i++){
			System.out.println(library[i].getTitle());
		}
		for(Book x : library){
			System.out.println(x.getTitle());
		}
		System.out.println("Expected Pages: 1600" );
		System.out.println("Actual Pages: " + numPagesInLibrary(library));
		System.out.println("Expected most pages: 1000");
		System.out.println("Actual Most pages: " + mostPages(library));
	}

	public static int numPagesInLibrary(Book[] books){
		int retPages = 0;
		for(Book x: books){
			retPages += x.getNumPages();
		}
		return retPages;
	}

	public static int mostPages(Book[] books){
		int most = 0;
		for(Book x : books){
			if(x.getNumPages()>most){
				most = x.getNumPages();
			}
		}
		return most;
	}
}
