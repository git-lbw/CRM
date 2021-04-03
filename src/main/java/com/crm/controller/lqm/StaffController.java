package com.crm.controller.lqm;

import com.crm.entities.CommonResult;
import com.crm.entities.Staff;
import com.crm.service.lqm.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/test")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/get/{id}")
    public CommonResult<Staff> getStaffById(@PathVariable("id") int id){
        Staff staff = staffService.getStaffById(id);
        log.info("结果"+staff);
        if(staff!=null){
            return new CommonResult(200,"查询成功,",staff);
        }else {
            return new CommonResult(500,"无记录");
        }
    }
}
