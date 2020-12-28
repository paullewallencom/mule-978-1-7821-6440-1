package com.org;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class NameTransfer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		if(src instanceof String)
		{
			String name=(String)src;
			{
			  if(name.charAt(0)=='/')
			  {
				return name.substring(1);
			  }
			}
		}
		return src;
	}

	
}
