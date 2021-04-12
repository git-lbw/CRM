package com.crm.dao.sdn;

import com.crm.entities.Returns;
import com.crm.vo.sdn.ReturnsVo;
import com.crm.vo.sdn.TicketVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *回款计划
 */
@Mapper
@Repository
public interface ReturnsDao {
        //添加回款计划
        @Insert("Insert into returns(staff_id,cu_id,contract_id,r_mayp,r_beenp,r_maym,r_beenm,r_date) values " +
                "(#{staffId},#{cuId},#{contractId},#{rMayp},#{rBeenp},#{rMaym},#{rBeenm},#{rDate})")
        Boolean addReturns(Returns returns);
        //根据合同id查询是否有该回款计划
        @Select("select * from returns where contract_id=#{contractId}")
        List<Returns> findReturnsByContractId(Integer contractId);

        //查询回款计划
        List<ReturnsVo> findAllReturns(ReturnsVo returnsVo);

        //回款状态视图
        public List<ReturnsVo> findReturnsView();

}
