package com.wuxi.infinitechat.authenticationservice.service;


import javax.servlet.http.HttpServletResponse;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuxi.infinitechat.authenticationservice.model.dto.user.*;
import com.wuxi.infinitechat.authenticationservice.model.entity.User;
import com.wuxi.infinitechat.authenticationservice.model.vo.user.UploadUrlResponse;
import com.wuxi.infinitechat.authenticationservice.model.vo.user.UserVO;

/**
 * @author Zzw
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2024-08-04 21:20:40
 */
public interface UserService {
    UserVO userLoginPwd(UserLoginPwdRequest userLoginPwdRequest, HttpServletResponse response);

    UserVO userLoginCode(UserLoginCodeRequest userLoginCodeRequest, HttpServletResponse response);

    void userRegister(UserRegisterRequest userRegisterRequest) throws InterruptedException;

    void updateAvatar(String id, UserUpdateAvatarRequest request);

    UploadUrlResponse getUploadUrl(String fileName) throws Exception;

    void sendClientSms(UserSMSRequest userSMSRequest);

    void userLogout(UserLogOutRequest userLogOutRequest);
}
