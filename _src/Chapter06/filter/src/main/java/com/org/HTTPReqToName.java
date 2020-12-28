package com.org;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class HTTPReqToName extends AbstractMessageTransformer
{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		String name = message.getInboundProperty("name");
        String lastName = message.getInboundProperty("lname");
 
        return name+" "+lastName;
	}

}
