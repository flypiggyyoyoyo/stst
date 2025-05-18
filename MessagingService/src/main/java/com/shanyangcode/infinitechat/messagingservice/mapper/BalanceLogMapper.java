package com.shanyangcode.infinitechat.messagingservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanyangcode.infinitechat.messagingservice.model.entity.BalanceLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 余额变动记录表 Mapper 接口
 */
@Mapper
public interface BalanceLogMapper extends BaseMapper<BalanceLog> {
}