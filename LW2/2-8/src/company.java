
public class company {

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
