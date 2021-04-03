package com.crm.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    public void setPatterns(String[] patterns) {
        this.patterns = patterns;
    }

    //当前转换器能够处理的字符串的格式
    private String[] patterns = {
            "yyyy/MM/dd"
    };
    SimpleDateFormat sdf = new SimpleDateFormat();

    public Date convert(String source) {
        Date date = null;
        //遍历数组，将数组元素作为格式传递sdf
        for (String pattern : patterns) {
            //应用格式
            sdf.applyPattern(pattern);
            try {
                date = sdf.parse(source);
                break;
            } catch (ParseException e) {

            }
        }
        if (date == null) {
            System.out.println("转换失败，格式不匹配");
        } else {
            System.out.println("转换成功");
        }
        return date;
    }
}
