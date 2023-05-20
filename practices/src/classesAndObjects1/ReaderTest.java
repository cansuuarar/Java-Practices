package classesAndObjects1;

public class ReaderTest {

	public static void main(String[] args) {

		Reader reader = new Reader();
		Book book = new Book();
		Author author = new Author();

		author.setName("cansu");
		
		book.getAuthor();
		book.setCurrentPage(10);
		book.setHardCover(true);
		book.setPage(400);
		book.setTitle("java");
		book.setType("software language");
		reader.read(book);

	}

}
