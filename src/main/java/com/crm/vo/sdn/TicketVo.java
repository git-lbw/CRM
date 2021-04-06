package com.crm.vo.sdn;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketVo {
    private Integer kId;
    private Integer staffId;
    private String reId;
    private double kMoney;
    private java.sql.Date kDate;
    private String staffName;
    private Integer kState;

    private String staffAccount;
    private String staffPassword;
    private String staffPhone;


    private Integer rId;
    private Integer contractId;
    private double reBeenm;
    private double reMoney;
    private Integer rePeriods;
    private java.sql.Date reDate;

    private Integer cuId;
    private String cuName;
    private String cuHigh;
    private String cuRank;
    private String cuState;
    private Integer cuMake;
    private java.sql.Date cuTime;
    private String cuSource;

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getReId() {
        return reId;
    }

    public void setReId(String reId) {
        this.reId = reId;
    }

    public double getkMoney() {
        return kMoney;
    }

    public void setkMoney(double kMoney) {
        this.kMoney = kMoney;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getkDate() {
        return kDate;
    }

    public void setkDate(Date kDate) {
        this.kDate = kDate;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getkState() {
        return kState;
    }

    public void setkState(Integer kState) {
        this.kState = kState;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public double getReBeenm() {
        return reBeenm;
    }

    public void setReBeenm(double reBeenm) {
        this.reBeenm = reBeenm;
    }

    public double getReMoney() {
        return reMoney;
    }

    public void setReMoney(double reMoney) {
        this.reMoney = reMoney;
    }

    public Integer getRePeriods() {
        return rePeriods;
    }

    public void setRePeriods(Integer rePeriods) {
        this.rePeriods = rePeriods;
    }

    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    public String getCuHigh() {
        return cuHigh;
    }

    public void setCuHigh(String cuHigh) {
        this.cuHigh = cuHigh;
    }

    public String getCuRank() {
        return cuRank;
    }

    public void setCuRank(String cuRank) {
        this.cuRank = cuRank;
    }

    public String getCuState() {
        return cuState;
    }

    public void setCuState(String cuState) {
        this.cuState = cuState;
    }

    public Integer getCuMake() {
        return cuMake;
    }

    public void setCuMake(Integer cuMake) {
        this.cuMake = cuMake;
    }

    public Date getCuTime() {
        return cuTime;
    }

    public void setCuTime(Date cuTime) {
        this.cuTime = cuTime;
    }

    public String getCuSource() {
        return cuSource;
    }

    public void setCuSource(String cuSource) {
        this.cuSource = cuSource;
    }
}
