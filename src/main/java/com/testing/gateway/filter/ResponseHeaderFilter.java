package com.testing.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletResponse;

public class ResponseHeaderFilter extends ZuulFilter{

    public boolean shouldFilter() {
        return true;
    }

    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 25;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletResponse servletResponse = context.getResponse();
        servletResponse.addHeader("X-Header", "header_12345");
        return null;
    }
}
