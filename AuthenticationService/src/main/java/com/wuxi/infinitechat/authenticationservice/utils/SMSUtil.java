package com.wuxi.infinitechat.authenticationservice.utils;


import javax.annotation.Resource;

import java.util.concurrent.TimeUnit;

import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.tea.TeaException;
import com.wuxi.infinitechat.authenticationservice.model.enums.ConfigEnum;
import com.wuxi.infinitechat.authenticationservice.model.enums.TimeOutEnum;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;

@Slf4j
public class SMSUtil {

    @Resource
    private RedisTemplate redisTemplate;

    public static com.aliyun.dysmsapi20170525.Client createClient() throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                .setAccessKeyId(ConfigEnum.SMS_ACCESS_KEY_ID.getValue())
                .setAccessKeySecret(ConfigEnum.SMS_ACCESS_KEY_SECRET.getValue());
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    public void sendServiceSms(String phoneNumber, String code) throws Exception {
        com.aliyun.dysmsapi20170525.Client client = SMSUtil.createClient();
        com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
                .setSignName(ConfigEnum.SMS_SIG_NAME.getValue())
                .setTemplateCode(ConfigEnum.SMS_TEMPLATE_CODE.getValue())
                .setPhoneNumbers(phoneNumber)
                .setTemplateParam("{\"code\":\"" + code + "\"}");
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        try {

            SendSmsResponse response = client.sendSmsWithOptions(sendSmsRequest, runtime);
            log.info("短信发送成功，response: {}", response);
        } catch (TeaException error) {
            com.aliyun.teautil.Common.assertAsString(error.message);
            log.error("短信发送失败，error: {}", error.message);
        } catch (Exception _error) {
            TeaException error = new TeaException(_error.getMessage(), _error);
            com.aliyun.teautil.Common.assertAsString(error.message);
            log.error("短信发送失败，error: {}", error.message);
        }
    }
}
