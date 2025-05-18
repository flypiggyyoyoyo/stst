package com.shanyangcode.infinitechat.messagingservice.model.entity;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

@Data
@JSONType(orders = {"type","data"})
public class MessageDTO {
    private Integer type;
    private Object data;
}
