package com.riseming.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @desc: 如何过滤请求到达我们的代理服务
 * 1.pre 请求到达路由之前执行
 * 2.route 过滤器可以处理请求的实际路由
 * @author: mingjianyong
 * @date: 2019-05-26  21:12
 */
public class AccessFilter  extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    @Override
    public Object run() {
        return null;
    }

    /**
     * @desc:
     * @author: mingjianyong
     * @date: 2019-05-26 21:31
     * @param
     * @return:
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public String filterType() {
        return null;
    }
}
