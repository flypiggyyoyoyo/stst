package com.shanyangcode.infinitechat.messagingservice.model.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class SendMsgRequest implements Serializable {

    private Long sessionId;

    private Long sendUserId;

    private Integer sessionType;

    private Integer type;

    private Long receiveUserId;

//    private String messageUuid;

    private Object body;

}
