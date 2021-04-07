package com.crm.controller.lqm;

import com.crm.entities.CommonResult;
import com.crm.entities.Staff;
import com.crm.service.lqm.StaffService;
import com.crm.utils.Constant;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.crm.utils.Constant.*;


@RestController
@Slf4j
@RequestMapping("/lqm")
public class StaffController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private StaffService staffService;

    @GetMapping("/get/{id}")
    public RestContent getStaffById(@PathVariable("id") int id){
        System.out.println(id);
        Staff staff = staffService.getStaffById(id);
        log.info("结果"+staff);
        return returnContent.getContent(staff,"数据获取成功","数据获取失败");
    }
}
