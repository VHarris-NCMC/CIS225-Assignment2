
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
   private Author author;
   private ISBN isbn;
   private Date publicationDate;
   private String title;
   private int pageCount;
   
   public Book(Author authorName, int isbn, int publicationDay, Date.Month publicationMonth, int publicationYear, String bookTitle, int numberOfPages)
   {
       author = authorName;
       this.isbn =new ISBN(isbn);
       publicationDate = new Date(publicationMonth, publicationDay, publicationYear); 
       title = bookTitle; 
       pageCount = numberOfPages;
       
       
   }
   public Date PublicationDate()
   {
       return publicationDate;
       
   }
   public Author GetAuthor()
   {
       return author;
   }
   public ISBN GetISBN()
   {
       return isbn;
   }
   public int PageCount()
   {
       return pageCount;
   }
   public String Title()
   {
       return title;
   }
   
}
