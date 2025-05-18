package com.shanyangcode.infinitechat.messagingservice.model.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

@Data
public class KafkaMsgVO {
    protected Long sessionId;

    protected Long sendUserId;

    protected Long messageId;

    protected Integer sessionType;

    protected Integer type;

    protected String messageUuid;

    protected Date createAt;

    protected Object body;
}

