package item_cart_classes;


public class Item {

	 
	private String name;
	private float price;
	private String category;
	private boolean onSale;
	
	public Item(String name,String category,float price,boolean onSale)
	{
		this.name=name;
		this.category=category;
		this.price=price;
		this.onSale=onSale;
	}
	
	public String getName() {return name;}
	public String getCategory() {return category;}
	public float getPrice() {return price;}
	public boolean getOnSale() {return onSale;}
	
	
	public void setDiscount(float discount_percent)
	{
		this.price= this.price-(this.price*discount_percent/100);
	}
	
	@Override
	public String toString()
	{
		return "Item [name :"+name+" ,category :"+category +" ,price :"+price +" ,onSale :"+onSale+"]\n" ;
	}
     	
	
}
