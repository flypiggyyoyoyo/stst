package com.shanyangcode.infinitechat.messagingservice.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("friend")
public class Friend {
    @TableId
    private Long id;
    private Long userId;
    private Long friendId;
    private Integer status; // 1: 好友, 2: 拉黑, 3: 删除
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
