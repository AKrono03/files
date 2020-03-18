package carrello;

class items
{
	private String name;
	private int price;
	
	public items(String st, int pr)
	{
		name = st;
		price = pr;
	}
	
	public void setArticleName(String productName)
	{
		name = productName;
	}
	
	public String getArticleName()
	{
		return name;
	}
	
	public void setArticlePrice(int pr)
	{
		price = pr;
	}
	
	public int getArticlePrice()
	{
		return price;
	}
}

class shoppingcart
{
	private int pos;
	private items[] itemsArray = new items[10];
	
	public shoppingcart()
	{
		pos = 0;
	}
	
	private void printArticle(int i)
	{
		System.out.print("Nome: " + itemsArray[i].getArticleName() + "   ");
		System.out.println("Prezzo: " + itemsArray[i].getArticlePrice());
	}
	
	public void printCart()
	{
		int i;
		
		for(i = 0; i<pos; i++)
		{
			printArticle(i);
		}
	}
	
	public void addToCart(String ItemName, int price)
	{	
		items currentArticle = new items(ItemName, price);
		itemsArray[pos] = currentArticle;
		pos++;
	}
	
	public void removeToCart(String ItemName)
	{
		int i;
		
		for(i = 0; i<pos; i++)
		{
			if(ItemName == itemsArray[i].getArticleName())
			{
				this.shift(i);
			}
		}
	}
	
	private void shift(int p)
	{
		int i;
		
		for(i = p; i< pos -1; i++)
		{
			itemsArray[i] = itemsArray[i + 1];
		}
		pos--;
	}
	
	public int total()
	{
		int i;
		int Atotal = 0;
		
		for(i= 0; i < pos; i++)
		{
			Atotal = Atotal + itemsArray[i].getArticlePrice();
		}
		
		return Atotal;
	}
	
}
