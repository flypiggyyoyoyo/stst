package com.shanyangcode.infinitechat.messagingservice.model.entity;

import lombok.Data;

@Data
public class PictureMessage extends AppMessage {
    private PictureMessageBody body;

    @Override
    public String toString(){
        return super.toString();
    }
}
