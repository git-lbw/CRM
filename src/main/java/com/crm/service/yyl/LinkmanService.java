package com.crm.service.yyl;

import com.crm.dao.yyl.LinkmanDao;
import com.crm.entities.Linkman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class LinkmanService {
    @Autowired
    LinkmanDao linkmanDao;
    //查询所有
    public List<Map<String,Object>> linkman_select(){
        return linkmanDao.linkman_select();
    }
    //查询客户名称
    public List<Map<String,Object>> linkman_name(String liName){
        return linkmanDao.linkman_name(liName);
    }
    //新增
    public void linkman_increased(Linkman linkman){
        linkmanDao.linkman_increased(linkman);
    }
    //修改
    public void linkman_amend(Linkman linkman){
        linkmanDao.linkman_amend(linkman);
    }
}
