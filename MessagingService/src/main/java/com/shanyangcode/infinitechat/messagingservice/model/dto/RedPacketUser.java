package com.shanyangcode.infinitechat.messagingservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class RedPacketUser {
    private String userName;
    private String avatar;
    private String receivedAt;
    private BigDecimal amount;

}