package com.shanyangcode.infinitechat.messagingservice.model.entity;

import lombok.Data;

@Data
public class TextMessageBody {
    private String content;
    private Long replyId;
}
