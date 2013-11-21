package com.taobao.tae.qa.taegrid.util.exception;

/**
 * User: xinyuan.ymm
 * Date: 13-11-20
 * Time: ����8:33
 */

/**
 * ϵͳ�����쳣״̬��
 */
public enum FatalExceptionCode implements ErrorCode {

    DB_ERROR(1001, "���ݿ��쳣"),
    NGINX_ERROR(1002, "·���쳣");

    private final int code;
    private final String comment;

    private FatalExceptionCode(int code, String comment) {
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
