package com.crm.service.xqp.impl;

import com.crm.dao.xqp.OrdessDao;
import com.crm.entities.Orders;
import com.crm.service.xqp.OrderssService;
import com.crm.vo.xqp.YearVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ImpOrderssService implements OrderssService {

    @Resource
    private OrdessDao ordessDao;

    public YearVO getmonth(String year) {
        return ordessDao.dde(year);
    }

    public List<String> getAll() {
        return ordessDao.getAll();
    }

    public YearVO hke(String year) {
        return ordessDao.hke(year);
    }

    public List<String> getyear() {
        return ordessDao.getyear();
    }

    public List<Map<String,Long>> khs(String year) {
        return ordessDao.khs(year);
    }

    public List<Map<String,Long>> jhs(String year) {
        return ordessDao.jhs(year);
    }

    public List<Map<String,Long>> dds(String year) {
        return ordessDao.dds(year);
    }

    public List<Map<String,Long>> xss(String year) {
        return ordessDao.dds(year);
    }

    public List<Map<String,Long>> top10(String year) {
        return ordessDao.top10(year);
    }

}
