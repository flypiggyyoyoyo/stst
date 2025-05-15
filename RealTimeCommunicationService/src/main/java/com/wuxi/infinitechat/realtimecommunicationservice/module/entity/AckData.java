package com.wuxi.infinitechat.realtimecommunicationservice.module.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AckData {

    private Long sessionId;

    private Long receiveUserUuid;

    private String msgUuid;
}
