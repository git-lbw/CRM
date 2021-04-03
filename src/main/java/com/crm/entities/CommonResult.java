package com.crm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String messege;
    private T      data;

    public CommonResult(Integer code, String messege) {
        this(code,messege,null);
    }
}
