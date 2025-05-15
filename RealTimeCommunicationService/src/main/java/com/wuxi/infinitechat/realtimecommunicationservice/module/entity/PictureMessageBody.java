package com.wuxi.infinitechat.realtimecommunicationservice.module.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PictureMessageBody {

    private Integer size;

    private String url;

    private String replyId;
}
