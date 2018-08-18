package company;

public class company {
	
	public static int money;
	public static String name, plan;

	public static order takeorder(order order)
	{
		return returnorder(order);
	}
	
	public static order returnorder(order order)
	{
		order.status = "Ready";
		
		return order;
	}
}
