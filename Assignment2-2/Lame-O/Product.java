
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    enum Design
    {
        Nature,
        Tech, 
        Business,
        Music,
        Naughty
               
    }
    private Design design;
    private int basePrice;
    private int[] featureCosts = new int[5];
    
    public Product(Design type, int basePrice, int featureCost1, int featureCost2, int featureCost3, int featureCost4, int featureCost5)
    {
        this.design = type;
        this.basePrice = basePrice;
        this.featureCosts[0] = featureCost1;
        this.featureCosts[1] = featureCost2;
        this.featureCosts[2] = featureCost3;
        this.featureCosts[3] = featureCost4;
        this.featureCosts[4] = featureCost5;
    }

    public Design GetDesign()
    {
        return design;
    }
    
    public int getPrice(int optFeatures)
    {
        return basePrice + featureCosts[optFeatures-1];
    }
}
