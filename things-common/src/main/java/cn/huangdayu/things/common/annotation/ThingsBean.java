package cn.huangdayu.things.common.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

/**
 * @author huangdayu
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
@Component
@Order
public @interface ThingsBean {

    @AliasFor(annotation = Component.class, attribute = "value")
    String value() default "";

    /**
     * 存在多个bean冲突时，是否是主要的bean
     * @return
     */
    boolean primary() default false;


    @AliasFor(annotation = Order.class, attribute = "value")
    int order() default Ordered.LOWEST_PRECEDENCE;
}
