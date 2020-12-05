package presentation;

public class Book {
    public String title;        // pole publiczne
    String author;
    private int numberOfPages;  // pole prywatne

    public void setNumberOfPages(int numberOfPages) {   // metoda publiczna
        if (isNumberOfPagesIsCorrect(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect: " + numberOfPages);
        }
    }

    private boolean isNumberOfPagesIsCorrect(int numberOfPages) {   // metoda prywatna
        return numberOfPages > 0;
    }
}