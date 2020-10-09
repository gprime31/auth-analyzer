package com.protect7.authanalyzer.filter;

import burp.IBurpExtenderCallbacks;
import burp.IHttpRequestResponse;

public class OnlyProxyFilter extends RequestFilter {

	@Override
	public boolean filterRequest(IBurpExtenderCallbacks callbacks, int toolFlag, IHttpRequestResponse messageInfo) {
		if(isSelected) {
			if(toolFlag == IBurpExtenderCallbacks.TOOL_PROXY) {
				return false;
			}
		}
		else {
			//Only allow Repeater beside of Proxy
			if(toolFlag == IBurpExtenderCallbacks.TOOL_REPEATER || toolFlag == IBurpExtenderCallbacks.TOOL_PROXY) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean hasStringLiterals() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getFilterStringLiterals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFilterStringLiterals(String[] stringLiterals) {
		// TODO Auto-generated method stub
		
	}

}
