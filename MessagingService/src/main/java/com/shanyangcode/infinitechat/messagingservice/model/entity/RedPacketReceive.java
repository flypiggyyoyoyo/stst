package com.shanyangcode.infinitechat.messagingservice.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 红包领取记录表
 */
@Data
@TableName("red_packet_receive")
public class RedPacketReceive {

    /**
     * 记录ID
     */
    @TableId("red_packet_receive_id")
    private Long redPacketReceiveId;

    /**
     * 红包ID
     */
    @TableField("red_packet_id")
    private Long redPacketId;

    /**
     * 领取者用户ID
     */
    @TableField("receiver_id")
    private Long receiverId;

    /**
     * 领取金额
     */
    @TableField("amount")
    private BigDecimal amount;

    /**
     * 领取时间
     */
    @TableField("received_at")
    private LocalDateTime receivedAt;
}
