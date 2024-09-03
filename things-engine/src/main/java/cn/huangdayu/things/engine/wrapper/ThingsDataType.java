package cn.huangdayu.things.engine.wrapper;

import lombok.Data;

import java.io.Serializable;

@Data
public class ThingsDataType implements Serializable {
    private ThingsSpecs specs;
    private String type;
    private String arrayType;
    private String enumNames;
    private boolean required = true;
}