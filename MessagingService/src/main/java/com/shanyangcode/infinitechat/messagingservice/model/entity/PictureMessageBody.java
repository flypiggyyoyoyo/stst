package com.shanyangcode.infinitechat.messagingservice.model.entity;

import lombok.Data;

@Data
public class PictureMessageBody {
    private Integer size;
    private String url;
    private Long replyId;
}
