package com.mr.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GateWayRouteConfig
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/24
 * @Version V1.09999999999999999
 **/
@Configuration
public class GateWayRouteConfig {

    @Bean
    public RouteLocator  routeLocator(RouteLocatorBuilder  routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        //build 建立
        routes.route("tianzhiao_path_1",r -> r.path("/zipkin").uri("http://localhost:9411/zipkin")).build();

        return routes.build();
    }
}
