package com.wuxi.infinitechat.realtimecommunicationservice.common;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "请求成功";
    private static final String DEFAULT_FAIL_MESSAGE = "请求失败";
    private static final String OPERATION_FAIL_MESSAGE = "操作失败";

    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }


    public static Result genFailResult() {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(DEFAULT_FAIL_MESSAGE);
    }


    /**
     * 响应返回结果
     *
     * @param flag 操作成功标识
     * @return 操作结果
     */
    public static Result toResult(boolean flag) {
        return flag ? ResultGenerator.genSuccessResult() : ResultGenerator.genFailResult(OPERATION_FAIL_MESSAGE);
    }
}
