package com.mr.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @ClassName GlobleFilter
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/24
 * @Version V1.09999999999999999
 **/
@Component
@Slf4j
public class GlobalConfigFilter implements GlobalFilter,Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        String uname = exchange.getRequest().getQueryParams().getFirst("uname");

        log.info("GlobalConfigFilter is 时间 = "+ new Date());

        if(uname == null){

            //就是个四零六
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);

            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
