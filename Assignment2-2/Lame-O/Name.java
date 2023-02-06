
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{

    private String first;
    private String last;
    
    
    public Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    
    
    public boolean isValid()
    {
        if(first.length() >=- 3 && last.length() >= 3)
        {
            return true;
        }
        else
        {
            System.out.println("Warning: Name is too short or missing");
            return false;
        }
    }
    public String GetName_Full()
    {
        return first + " " + last;
    }
}
