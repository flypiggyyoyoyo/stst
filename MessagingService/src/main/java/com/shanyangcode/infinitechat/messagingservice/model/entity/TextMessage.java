package com.shanyangcode.infinitechat.messagingservice.model.entity;

import lombok.Data;

@Data
public class TextMessage extends AppMessage {
    private TextMessageBody body;

    @Override
    public String toString(){
        return super.toString();
    }
}
