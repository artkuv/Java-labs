
public class client {

	private String name;
	private int money;
	
	public static String getorder()
	{
		order order = new order(23423,2,"Not ready","Chat");
		company.takeorder(order);
		company.returnorder(order);
		return (order.status);
	}
	
	public static String givemoney()
	{
		return "Money gived";
	}
}
