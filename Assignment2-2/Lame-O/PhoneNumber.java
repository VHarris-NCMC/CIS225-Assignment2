
/**
 * Write a description of class PhoneNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneNumber
{

    private String number;
    
    public PhoneNumber(String phone)
    {
    this.number = phone;
    
    }
    public boolean isValid()
    {
        int digits;
        try
        {
            Integer.parseInt(number);
            if (number.length() == 9)
            {
            
                return true;
            }
            else
            {
                System.out.println("Warning: phone number is not valid");
                return false;
            
            }
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        
    }
}
