package com.crm.service.wjl.impl;

import com.crm.dao.wjl.ResourcesDao;
import com.crm.entities.Resources;
import com.crm.service.wjl.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Resource
    private ResourcesDao resourcesDao;

    @Override
    public List<Resources> selectAll() {
        return null;
    }
}
