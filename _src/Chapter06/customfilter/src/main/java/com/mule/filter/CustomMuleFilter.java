package com.mule.filter;

import org.mule.api.MuleMessage;
import org.mule.api.routing.filter.Filter;

public class CustomMuleFilter implements Filter {

	@Override
	public boolean accept(MuleMessage message) {
		try 
		{
			String name = message.getInboundProperty("name");
			String lname = message.getInboundProperty("lname");
			
			if((name.equalsIgnoreCase("azaz") && lname.equalsIgnoreCase("desai")))
			{	
				
				return true;	
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
