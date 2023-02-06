
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    private int id;
    
    private Name name;
    private Company company;
    private Address address;
    private PhoneNumber phone;
    
    public Customer(String firstName, String lastName, String companyName, String addressLine1, String city, String state, String zip, String phoneNumber)
    {
        
        
        this.id = CRM.instance.GetUniqueID();
        this.name = new Name(firstName, lastName);
        
        this.company = new Company(companyName);
        this.phone = new PhoneNumber(phoneNumber);
        this.address = new Address(addressLine1, city, state, zip);
        this.validate();    
    }
    
    private void validate()
    {
        if (name.isValid() && phone.isValid() && address.isValid())
        {
            System.out.println("Customer Added Successfully");
        }
        
    }
    public void orderProduct(Product.Design design, int optionalFeatures)
    {
        CRM.instance.submitOrder(this, design, optionalFeatures);
    }
    public String Name()
    {
        return name.GetName_Full();
    }
}
