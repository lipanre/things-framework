package cn.huangdayu.things.camel.converter;

import org.apache.camel.TypeConverter;

/**
 * @author huangdayu
 */
public abstract class AbstractTypeConverter {


    public abstract Class<?> toType();

    public abstract Class<?> fromType();

    public abstract TypeConverter typeConverter();

}
