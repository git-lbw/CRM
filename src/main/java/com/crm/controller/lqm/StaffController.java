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

import java.util.List;

import static com.crm.utils.Constant.*;


@RestController
@Slf4j
@RequestMapping("/lqm")
public class StaffController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private StaffService staffService;

    /**
     * 根据员工id获取员工数据
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public RestContent getStaffById(@PathVariable("id") int id){
        Staff staff = staffService.getStaffById(id);
        return returnContent.getContent(staff,"数据获取成功","数据获取失败");
    }

    /**
     * 获取所有员工
     * @return
     */
    @GetMapping("/getAllStaff")
    public RestContent getAllStaff(){
        List<Staff> staffList = staffService.getAllStaff();
        return returnContent.getContent(staffList,"获取所有员工成功","获取所有员工失败");
    }
}
