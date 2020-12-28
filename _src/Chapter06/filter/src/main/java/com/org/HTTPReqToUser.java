package com.org;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class HTTPReqToUser extends AbstractMessageTransformer
{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		User user = new User();
		 
		String name = message.getInboundProperty("name");
		String lastName = message.getInboundProperty("lname");
		user.setLname(lastName);
		user.setName(name);
		return user;
	}

}
