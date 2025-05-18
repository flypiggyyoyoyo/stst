package com.shanyangcode.infinitechat.messagingservice.model.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AppMessage {

   protected Long sessionId;

   protected List<Long> receiveUserIds;

   protected Long sendUserId;

   protected String userName;

   protected String avatar;

   protected Integer type;

   protected Long messageId;

   protected Integer sessionType;

   protected String sessionName;

   protected String sessionAvatar;

   private String createdAt;

   protected Object body;
}
