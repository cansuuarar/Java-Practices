package classesAndObjects1;

public class Book {
	String title;
	int page;
	String type;
	boolean isHardCover;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean isHardCover() {
		return isHardCover;
	}

	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	int currentPage;
	Author author;

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
}
