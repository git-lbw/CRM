package com.crm.dao.thf;


import com.crm.vo.thf.ReceiptdeliveryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReceiptdeliveryVoDao {
    //查询所有出入库单
    List<ReceiptdeliveryVo> findAllReceiptdeliveryVo();
}
