package com.taobao.tae.qa.taegrid.util.exception;

/**
 * User: xinyuan.ymm
 * Date: 13-11-20
 * Time: 下午8:33
 */

/**
 * 依赖系统异常状态码
 */
public enum DependencyExceptionCode implements ErrorCode {

    TAIR_ERROR(2001, "TAIR异常"),
    DIAMOND_ERROR(2002, "DIAMOND异常");

    private final int code;
    private final String comment;

    private DependencyExceptionCode(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    @Override
    public int getCode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getComment() {
        return comment;
    }
}
