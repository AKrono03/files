package carrello;

public class start
{
	public static void main(String[] args)
	{
		shoppingcart C = new shoppingcart();
		C.addToCart("Caff�", 2);
		C.addToCart("Latte", 1);
		C.addToCart("Pringles", 3);
		C.addToCart("Fesa", 11);
		C.addToCart("Amazon Prime", 18);
		C.addToCart("Apple Care +", 99);
		C.removeToCart("Latte");
		C.removeToCart("Fesa");
		C.addToCart("Echo Dot", 18); //Piccola modifica innocente
		C.addToCart("Carta Igenica", 2);
		
		
		C.printCart();
		System.out.println("Totale: " + C.total());
	}
}