
/**
 * Write a description of class BillOfSale here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BillOfSale
{
    private int invoiceNumber;
    private Product.Design type;
    private int numberOfFeatures;
    private int amount;
    private Customer customer;
    
    public BillOfSale(Customer c, Product.Design type, int numFeatures, int amount)
    {
        this.invoiceNumber = CRM.instance.getUniqueInvoiceNumber();
        this.customer = c;
        this.type = type;
        this.numberOfFeatures = numFeatures;
        this.amount = amount;
        
    }
    
    public void PrintDetails()
    {
        System.out.println("Invoice Number: " + invoiceNumber + " : Customer - " + customer.Name() + " Amount - " + amount);
    }
}
