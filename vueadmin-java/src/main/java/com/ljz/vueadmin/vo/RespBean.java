package com.ljz.vueadmin.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Resp bean.
 *
 * @ClassName : RespBean
 * @Description : 公共返回对象
 * @Author : ljz
 * @Date: 2022 /2/21  15:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private Integer code;
    private String msg;
    private Object data;


    /**
     * Success resp bean.
     * 成功返回结果
     * @param msg the msg
     * @return the resp bean
     */
    public static RespBean success(String msg){
        return new RespBean(200, msg, null);
    }


    /**
     * Success resp bean.
     * 成功返回结果
     * @param msg  the msg
     * @param data the data
     * @return the resp bean
     */
    public static RespBean success(String msg, Object data){
        return new RespBean(200, msg, data);
    }


    /**
     * Error resp bean.
     * 失败返回结果
     * @param msg the msg
     * @return the resp bean
     */
    public static RespBean error(String msg){
        return new RespBean(500, msg, null);
    }


    /**
     * Error resp bean.
     * 失败返回结果
     * @param msg  the msg
     * @param data the data
     * @return the resp bean
     */
    public static RespBean error(String msg, Object data){
        return new RespBean(500, msg, data);
    }
}
