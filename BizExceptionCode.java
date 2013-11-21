package com.taobao.tae.qa.taegrid.util.exception;

/**
 * User: xinyuan.ymm
 * Date: 13-11-20
 * Time: ����8:33
 */

/**
 * ҵ���쳣״̬��
 */
public enum BizExceptionCode implements ErrorCode {

    PARAM_ERROR(3002, "�����쳣");

    private final int code;
    private final String comment;

    private BizExceptionCode(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getComment() {
        return comment;
    }


}
