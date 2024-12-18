package cn.huangdayu.things.engine.chaining;

import cn.huangdayu.things.api.message.ThingsHandling;
import cn.huangdayu.things.api.message.ThingsIntercepting;
import cn.huangdayu.things.common.annotation.ThingsFilter;
import cn.huangdayu.things.common.wrapper.ThingsRequest;
import cn.huangdayu.things.common.wrapper.ThingsResponse;
import lombok.extern.slf4j.Slf4j;

import static cn.huangdayu.things.common.enums.ThingsStreamingType.OUTPUTTING;

/**
 * @author huangdayu
 */
@Slf4j
@ThingsFilter(source = OUTPUTTING)
public class ThingsOutputtingIntercepting implements ThingsIntercepting {

    @Override
    public void afterCompletion(ThingsRequest request, ThingsResponse response, ThingsHandling handling, Exception exception) {
        log.debug("Things outputting , times: {} , request： {} , response: {} , handling: {} , exception: ",
                System.currentTimeMillis() - request.getJtm().getTime(), request.getJtm(), request.getJtm(), handling.getClass().getSimpleName(), exception);
    }
}
