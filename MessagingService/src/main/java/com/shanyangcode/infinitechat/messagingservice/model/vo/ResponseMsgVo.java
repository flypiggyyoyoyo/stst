package com.shanyangcode.infinitechat.messagingservice.model.vo;

import lombok.Data;

import java.util.Date;
@Data
public class ResponseMsgVo {
    private String sessionId;

    private Integer sessionType;

    private Integer type;

    private Long messageId;

    private Object body;

    private String createdAt;

}
