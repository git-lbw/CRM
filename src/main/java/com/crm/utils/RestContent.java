package com.crm.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 返回到前台的封装对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class RestContent<T> {

    //状态码
    private Integer state;
    //实例对象
    private T content;
    //返回信息
    private String info;
}
