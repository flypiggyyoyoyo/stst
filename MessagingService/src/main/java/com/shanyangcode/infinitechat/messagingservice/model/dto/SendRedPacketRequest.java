package com.shanyangcode.infinitechat.messagingservice.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SendRedPacketRequest {

    private Long sessionId;
    private Long receiveUserId;
    private Long sendUserId;
    private Integer type;
    private Integer sessionType;
    private Body body;


    @Data
    public static class Body {
        private Integer redPacketType;
        private BigDecimal totalAmount;
        private Integer totalCount;
        private String redPacketWrapperText;
    }
}
