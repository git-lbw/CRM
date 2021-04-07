package com.crm.dao.thf;

import com.crm.entities.Warehouseinandoutflow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WarehouseinandoutflowDao {
    //新增出入库流水
    @Insert("insert into Warehouseinandoutflow value(null,#{productId},#{receiptdeliveryId},#{inoutQuantity})")
    void insertWarehouseinandoutflow(Warehouseinandoutflow warehouseinandoutflow);
}
