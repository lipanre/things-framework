package cn.huangdayu.things.api.sofabus;

import cn.huangdayu.things.common.enums.ThingsSofaBusType;
import cn.huangdayu.things.common.wrapper.ThingsRequest;
import cn.huangdayu.things.common.wrapper.ThingsResponse;

/**
 * @author huangdayu
 */
public interface ThingsSofaBus {

    ThingsSofaBusType getType();

    void init();

    boolean start();

    boolean stop();

    boolean output(String topic, ThingsRequest thingsRequest, ThingsResponse thingsResponse);

    boolean subscribe(String topic);

    boolean unsubscribe(String topic);

    boolean isStarted();

}
