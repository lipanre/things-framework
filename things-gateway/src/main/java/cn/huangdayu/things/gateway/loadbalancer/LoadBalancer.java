package cn.huangdayu.things.gateway.loadbalancer;

import java.util.List;

public interface LoadBalancer {

    String getNextServer(List<String> servers, String clientId);
}
