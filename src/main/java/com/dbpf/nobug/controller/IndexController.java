package com.dbpf.nobug.controller;

import com.dbpf.nobug.common.dto.DataMsg;
import com.dbpf.nobug.common.enums.ErrorEnum;
import com.dbpf.nobug.database.dto.SysUser;
import com.dbpf.nobug.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author juebing
 * @version v1.0
 * @date 2019/5/15 19:34
 * @description
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/to/login")
    public ModelAndView defaultLogin() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DataMsg login(@RequestParam("username") String username, @RequestParam("password") String password) {
        DataMsg dataMsg = new DataMsg();
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        try {
            subject.login(token);
            SysUser sysUser = userService.findSysUserByUserName(StringUtils.trim(username));
            if(null != sysUser) {
                dataMsg.setRes_code(ErrorEnum.RES_0000.getErrorCode());
                dataMsg.setRes_msg(ErrorEnum.RES_0000.getErrorMsg());
                return dataMsg;
            }
        } catch (UnknownAccountException uae) {
            dataMsg.setRes_code(ErrorEnum.RES_0001.getErrorCode());
            dataMsg.setRes_msg("未知账户");
            return dataMsg;
        } catch (IncorrectCredentialsException ice) {
            dataMsg.setRes_code(ErrorEnum.RES_0001.getErrorCode());
            dataMsg.setRes_msg("密码不正确");
            return dataMsg;
        }  catch (AuthenticationException ae) {
            dataMsg.setRes_code(ErrorEnum.RES_0001.getErrorCode());
            dataMsg.setRes_msg("用户名或密码不正确");
            return dataMsg;
        }
        if (subject.isAuthenticated()) {
            dataMsg.setRes_code(ErrorEnum.RES_0000.getErrorCode());
            dataMsg.setRes_msg(ErrorEnum.RES_0000.getErrorMsg());
            return dataMsg;
        } else {
            dataMsg.setRes_code(ErrorEnum.RES_0001.getErrorCode());
            dataMsg.setRes_msg(ErrorEnum.RES_0001.getErrorMsg());
            token.clear();
            return dataMsg;
        }
    }
}