
/**
 * Write a description of class Printer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Printer
{
    private static Date.Format defaultDateForm = Date.Format.SlashDMY;
    
   public static void PrintPublicationDate(Book book)
   {
       System.out.println("Publication Date: " + book.PublicationDate().getDate(defaultDateForm));
   }
   public static void PrintAuthor(Book book)
   {
       System.out.println("Author: " + book.GetAuthor().FullName());
   }
   public static void PrintISBN(Book book)
   {
       System.out.println("ISBN: " + book.GetISBN().getISBN());
   }
   public static void PrintPageCount(Book book)
   {
       System.out.println("Pages: " + book.PageCount());
   }
   public static void PrintTitle(Book book)
   {
       System.out.println("Title: " + book.Title());
   }
   public static void PrintAll(Book book)
   {
       PrintPublicationDate(book);
       PrintAuthor(book);
       PrintISBN(book);
       PrintPageCount(book);
       PrintTitle(book);
   }
}

