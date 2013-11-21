package com.taobao.tae.qa.taegrid.util.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * User: xinyuan.ymm
 * Date: 13-11-20
 * Time: 下午8:26
 * How to write a good exception class.
 */
public class SystemException extends RuntimeException {

    private ErrorCode errorCode;

    // 为 异常添加动态属性
    private Map<String, Object> propertiesMap;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, Object> getPropertiesMap() {
        return propertiesMap;
    }

    public void setPropertiesMap(Map<String, Object> propertiesMap) {
        this.propertiesMap = propertiesMap;
    }

    public void set(String name, Object obj) {
        if (propertiesMap == null) {
            propertiesMap = new HashMap();
        }
        propertiesMap.put(name, obj);
    }

}
