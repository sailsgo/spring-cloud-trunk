package com.riseming.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.riseming.entity.entity.ResultBean;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @desc: 如何过滤请求到达我们的代理服务
 * 1.pre 请求到达路由之前执行
 * 2.route 过滤器可以处理请求的实际路由
 * @author: mingjianyong
 * @date: 2019-05-26  21:12
 */
public class AccessFilter  extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * @desc 过滤器的具体逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("{} reuqest to {}",request.getMethod(),request.getRequestURL().toString());
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            logger.warn("access token is empty");
            ctx.set("error.status_code", HttpServletResponse.SC_UNAUTHORIZED);
            ctx.set("error.message","UnAuthorized,please input token");
            return null;
        }
        logger.info("access token ok");
        return null;
    }

    /**
     * @desc: 通过int值来定义过滤器的执行顺序
     * @author: mingjianyong
     * @date: 2019-05-26 21:31
     * @param
     * @return:
     */
    @Override
    public int filterOrder() {
        return -10;
    }

    /**
     * @desc: 返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * @desc:  返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     *  pre：可以在请求被路由之前调用
     *  routing：在路由请求时候被调用
     *  post：在routing和error过滤器之后被调用
     *  error：处理请求时发生错误时被调用
     * @author: mingjianyong
     * @date: 2019-05-26 21:31
     * @param
     * @return:
     */
    @Override
    public String filterType() {
        return "pre";
    }
}
