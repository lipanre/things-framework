package cn.huangdayu.things.api.endpoint;


import cn.huangdayu.things.common.dto.ThingsInfo;
import cn.huangdayu.things.common.message.JsonThingsMessage;
import cn.huangdayu.things.common.wrapper.ThingsInstance;

import java.util.Set;

/**
 * 消息点对点发布
 *
 * @author huangdayu
 */
public interface ThingsEndpoint {

    /**
     * 获取物模型支持列表
     *
     * @return
     */
    Set<ThingsInfo> getThingsDsl();

    /**
     * 点对点发送消息
     *
     * @param message
     * @return
     */
    JsonThingsMessage send(JsonThingsMessage message);

    /**
     * 发布消息
     *
     * @param message
     */
    void publish(JsonThingsMessage message);

    /**
     * 交换实例信息
     *
     * @param thingsInstance 请求者的实例信息
     * @return 本实例的信息
     */
    ThingsInstance exchange(ThingsInstance thingsInstance);


}
