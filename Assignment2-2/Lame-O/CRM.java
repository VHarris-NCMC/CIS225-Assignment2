import java.util.ArrayList;
/**
 * Write a description of class CRM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CRM
{
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<BillOfSale> orders;
    public static CRM instance;
    
    
    public CRM()
    {
           
            if (instance == null)
            {
                instance = this;
            }
            else
            {
                System.out.println("Warning: CRM instance already exists");
            }
        
        customers = new ArrayList<Customer>();
        products = new ArrayList<Product>();
        orders = new ArrayList<BillOfSale>();
        
        this.generateProducts();
        
        
    }

    public void AddCustomer(Customer customer)
    {

        customers.add(customer);

    }
    public int GetUniqueID()
    {
        return customers.size() +1;
    }
    public int getUniqueInvoiceNumber()
    {
        return orders.size() + 1;
    }

    private void generateProducts()
    {
        products.add(new Product(Product.Design.Nature, 300, 10, 15, 20, 25, 30));
        products.add(new Product(Product.Design.Tech, 350, 20, 30, 40, 50, 60));
        products.add(new Product(Product.Design.Business, 375, 30, 40, 50, 60, 70));
        products.add(new Product(Product.Design.Music, 400, 85, 95, 110, 130, 210));
        products.add(new Product(Product.Design.Naughty, 500, 100, 200, 300, 400, 500));
    
    }
    public String GetQuote(Product.Design design, int numberOfOptionalFeatures)
    {
        Product productToQuote;
        for (Product p : products)
        {
            if (p.GetDesign() == design)
              {
                productToQuote = p;
                return "A " + design + " product with " + numberOfOptionalFeatures + " optional features will cost $" + productToQuote.getPrice(numberOfOptionalFeatures); 
                        
            }
        }
        return "Product not found";
      
    }
    public int getCost(Product.Design design, int numberOfOptionalFeatures)
    {
        Product productToQuote;
        for (Product p : products)
        {
            if (p.GetDesign() == design)
            {
                return p.getPrice(numberOfOptionalFeatures);
                
                
            }
        }
        return 0;
      
    }
    public void printOrders()
    {
        for (BillOfSale o : orders)
        {
            o.PrintDetails();
        }
    }
    public void submitOrder(Customer c, Product.Design type, int features)
    {
     
        orders.add(new BillOfSale(c, type, features, getCost(type, features)));
   
    }
}

