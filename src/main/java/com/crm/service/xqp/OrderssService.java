package com.crm.service.xqp;

import com.crm.entities.Orders;
import com.crm.vo.xqp.YearVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OrderssService {
     YearVO getmonth(String year);
     List<String> getAll();
     YearVO hke(String year);
     List<String> getyear();
     List<Map<String,Long>> khs(String year);
     List<Map<String,Long>> jhs(String year);
     List<Map<String,Long>> dds(String year);
     List<Map<String,Long>> xss(String year);
     List<Map<String,Long>> top10(String year);
}

