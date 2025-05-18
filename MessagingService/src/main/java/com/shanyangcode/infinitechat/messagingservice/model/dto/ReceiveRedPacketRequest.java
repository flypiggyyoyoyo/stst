package com.shanyangcode.infinitechat.messagingservice.model.dto;

import lombok.Data;

@Data
public class ReceiveRedPacketRequest {
    private Long userId;
    private Long redPacketId;
}
