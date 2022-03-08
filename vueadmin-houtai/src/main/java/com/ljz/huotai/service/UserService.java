package com.ljz.huotai.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.ljz.huotai.pojo.User;
import com.ljz.huotai.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author ljz
 * @since 2022 -03-06
 */
public interface UserService extends IService<User> {

    /**
     * Login resp bean.
     * 登录之后返回token
     *
     * @param username the username
     * @param password the password
     * @param code     the code
     * @param request  the request
     * @return the resp bean
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);


    /**
     * Gets admin by user name.
     * 根据用户名获取用户信息
     * @param username the username
     * @return the admin by user name
     */
    User getAdminByUserName(String username);


    /**
     * Gets users info by page.
     * 查询所有用户信息分页
     * @param currentPage the current page
     * @param pageSize    the page size
     * @param user        the user
     * @param dataScope   the data scope
     * @return the users info by page
     */
    RespBean getUsersInfoByPage(Integer currentPage, Integer pageSize, User user, Date[] dataScope);
}
