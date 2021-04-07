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
     List<Map<String,Long>> hts(String year);
     List<Map<String,Long>> cp(String year);
     List<Map<String,Long>> xsld(String year);
     List<String> getkhyear();
     List<String> getddyear();
     List<String> getxsyear();
     List<String> gettopyear();
     List<String> gethtyear();
     List<String> getldyear();
     List<String> getcpxsyear();
     List<String> getjhyear();
     List<Map<Object,String>> hikuai(String year);
     List<Map<Object,Object>> top(String year);
     List<Map<Object,String>> hetong(String year);
     List<Map<Object,String>> xiaoshould(String year);
     List<Map<Object,String>> chanping(String year);
   //  List<Orders> orderall(String year);
}


