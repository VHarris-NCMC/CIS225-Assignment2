
/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
    private String address;
    private String city;
    private String state;
    private String zip;
    
    public Address(String addr, String city, String state, String zip)
    {
        this.address = addr;
        this.city = city;
        this.state = state;
        this.zip = zip;
        
    }
  
    public boolean isValid()
    {
        if (address.length() >= 3 && city.length() >= 3 && state.length() >= 3 && zip.length() == 5)
        {
            return true;
        }
        else
        {
            System.out.println("Warning: Address Invalid");
            return false;
        }
    }
}
