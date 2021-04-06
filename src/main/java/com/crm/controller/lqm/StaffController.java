package com.crm.controller.lqm;

import com.crm.entities.CommonResult;
import com.crm.entities.Staff;
import com.crm.service.lqm.StaffService;
import com.crm.utils.Constant;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/login/{username}/{password}")
    public RestContent Stafflogin(@PathVariable("username") String account, @PathVariable("password") String password){
        Staff staff = staffService.staffLogin(account, password);
        if (staff!=null){
            return returnContent.getContent(1,"登录成功","登录失败");
        }else {
            return returnContent.getContent(null,"登录成功","登录失败，账号或密码错误");
        }
    }
}
