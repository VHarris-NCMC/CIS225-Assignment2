
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String firstName;
    private String lastName;
    
    public Author(String first, String last)
    {
        firstName = first;
        lastName = last;
        
    }
    
    public String FullName()
    {
        return firstName + " " + lastName;
        
    }
}
