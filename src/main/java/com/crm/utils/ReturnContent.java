package com.crm.utils;

import org.springframework.stereotype.Component;

@Component
public interface ReturnContent {

    /**
     * 通过判断对象t是否为空表示返回对象的成功与失败
     * @param t 判断对象
     * @param info  成功是返回的附带信息
     * @param error 失败是返回的附带信息
     * @return
     */
    public RestContent getContent(Object t, String info, String error);

    /**
     * 通过判断对象t是否为空表示返回对象的成功与失败
     * @param t 整形判断
     * @param info  成功是返回的附带信息
     * @param error 失败是返回的附带信息
     * @return
     */
    public RestContent getContent(int t, String info, String error);
}
