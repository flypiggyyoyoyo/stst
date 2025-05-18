package com.shanyangcode.infinitechat.messagingservice.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 用户余额表
 */
@Data
@TableName("user_balance")
public class UserBalance {

    /**
     * 用户ID
     */
    @TableId("user_id")
    private Long userId;

    /**
     * 余额
     */
    @TableField("balance")
    private BigDecimal balance;

    /**
     * 更新时间
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
