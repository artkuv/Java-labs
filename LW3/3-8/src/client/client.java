package client;

import company.company;
import company.order;
import company.rushorder;

public class client {

	private String name;
	private int money;
	
	public static String getorder()
	{
		rushorder order = new rushorder(23423,2,"Not ready","Chat");
		company.takeorder(order);
		company.returnorder(order);
		return "Order made";
	}
	
	public static String givemoney()
	{
		company.money++;
		return "Money gived";
	}
}
