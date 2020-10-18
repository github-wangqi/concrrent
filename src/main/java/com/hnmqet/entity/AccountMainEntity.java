package com.hnmqet.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "account_main", schema = "logistics", catalog = "")
public class AccountMainEntity {
    private long acctId;
    private long personId;
    private String personName;
    private String nameFirstSpell;
    private String cardNo;
    private BigDecimal balance;
    private int acctStatus;
    private Integer acctType;
    private BigDecimal limitEach;
    private BigDecimal limitDay;
    private BigDecimal limitWeek;
    private BigDecimal limitMonth;
    private Timestamp limitStarttime;
    private Timestamp limitEndtime;
    private BigDecimal limitValue;
    private Long dareaId;
    private Integer dareaType;
    private Integer dstatus;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Long operId;
    private String operName;
    private String remark;

    @Id
    @Column(name = "acct_id", nullable = false)
    public long getAcctId() {
        return acctId;
    }

    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "person_name", nullable = true, length = 50)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "name_first_spell", nullable = true, length = 64)
    public String getNameFirstSpell() {
        return nameFirstSpell;
    }

    public void setNameFirstSpell(String nameFirstSpell) {
        this.nameFirstSpell = nameFirstSpell;
    }

    @Basic
    @Column(name = "card_no", nullable = true, length = 32)
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Basic
    @Column(name = "balance", nullable = false, precision = 2)
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "acct_status", nullable = false)
    public int getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(int acctStatus) {
        this.acctStatus = acctStatus;
    }

    @Basic
    @Column(name = "acct_type", nullable = true)
    public Integer getAcctType() {
        return acctType;
    }

    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
    }

    @Basic
    @Column(name = "limit_each", nullable = true, precision = 2)
    public BigDecimal getLimitEach() {
        return limitEach;
    }

    public void setLimitEach(BigDecimal limitEach) {
        this.limitEach = limitEach;
    }

    @Basic
    @Column(name = "limit_day", nullable = true, precision = 2)
    public BigDecimal getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(BigDecimal limitDay) {
        this.limitDay = limitDay;
    }

    @Basic
    @Column(name = "limit_week", nullable = true, precision = 2)
    public BigDecimal getLimitWeek() {
        return limitWeek;
    }

    public void setLimitWeek(BigDecimal limitWeek) {
        this.limitWeek = limitWeek;
    }

    @Basic
    @Column(name = "limit_month", nullable = true, precision = 2)
    public BigDecimal getLimitMonth() {
        return limitMonth;
    }

    public void setLimitMonth(BigDecimal limitMonth) {
        this.limitMonth = limitMonth;
    }

    @Basic
    @Column(name = "limit_starttime", nullable = true)
    public Timestamp getLimitStarttime() {
        return limitStarttime;
    }

    public void setLimitStarttime(Timestamp limitStarttime) {
        this.limitStarttime = limitStarttime;
    }

    @Basic
    @Column(name = "limit_endtime", nullable = true)
    public Timestamp getLimitEndtime() {
        return limitEndtime;
    }

    public void setLimitEndtime(Timestamp limitEndtime) {
        this.limitEndtime = limitEndtime;
    }

    @Basic
    @Column(name = "limit_value", nullable = true, precision = 2)
    public BigDecimal getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
        this.limitValue = limitValue;
    }

    @Basic
    @Column(name = "darea_id", nullable = true)
    public Long getDareaId() {
        return dareaId;
    }

    public void setDareaId(Long dareaId) {
        this.dareaId = dareaId;
    }

    @Basic
    @Column(name = "darea_type", nullable = true)
    public Integer getDareaType() {
        return dareaType;
    }

    public void setDareaType(Integer dareaType) {
        this.dareaType = dareaType;
    }

    @Basic
    @Column(name = "dstatus", nullable = true)
    public Integer getDstatus() {
        return dstatus;
    }

    public void setDstatus(Integer dstatus) {
        this.dstatus = dstatus;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "oper_id", nullable = true)
    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    @Basic
    @Column(name = "oper_name", nullable = true, length = 64)
    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 256)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountMainEntity that = (AccountMainEntity) o;

        if (acctId != that.acctId) return false;
        if (personId != that.personId) return false;
        if (acctStatus != that.acctStatus) return false;
        if (personName != null ? !personName.equals(that.personName) : that.personName != null) return false;
        if (nameFirstSpell != null ? !nameFirstSpell.equals(that.nameFirstSpell) : that.nameFirstSpell != null)
            return false;
        if (cardNo != null ? !cardNo.equals(that.cardNo) : that.cardNo != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (acctType != null ? !acctType.equals(that.acctType) : that.acctType != null) return false;
        if (limitEach != null ? !limitEach.equals(that.limitEach) : that.limitEach != null) return false;
        if (limitDay != null ? !limitDay.equals(that.limitDay) : that.limitDay != null) return false;
        if (limitWeek != null ? !limitWeek.equals(that.limitWeek) : that.limitWeek != null) return false;
        if (limitMonth != null ? !limitMonth.equals(that.limitMonth) : that.limitMonth != null) return false;
        if (limitStarttime != null ? !limitStarttime.equals(that.limitStarttime) : that.limitStarttime != null)
            return false;
        if (limitEndtime != null ? !limitEndtime.equals(that.limitEndtime) : that.limitEndtime != null) return false;
        if (limitValue != null ? !limitValue.equals(that.limitValue) : that.limitValue != null) return false;
        if (dareaId != null ? !dareaId.equals(that.dareaId) : that.dareaId != null) return false;
        if (dareaType != null ? !dareaType.equals(that.dareaType) : that.dareaType != null) return false;
        if (dstatus != null ? !dstatus.equals(that.dstatus) : that.dstatus != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (operId != null ? !operId.equals(that.operId) : that.operId != null) return false;
        if (operName != null ? !operName.equals(that.operName) : that.operName != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (acctId ^ (acctId >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        result = 31 * result + (nameFirstSpell != null ? nameFirstSpell.hashCode() : 0);
        result = 31 * result + (cardNo != null ? cardNo.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + acctStatus;
        result = 31 * result + (acctType != null ? acctType.hashCode() : 0);
        result = 31 * result + (limitEach != null ? limitEach.hashCode() : 0);
        result = 31 * result + (limitDay != null ? limitDay.hashCode() : 0);
        result = 31 * result + (limitWeek != null ? limitWeek.hashCode() : 0);
        result = 31 * result + (limitMonth != null ? limitMonth.hashCode() : 0);
        result = 31 * result + (limitStarttime != null ? limitStarttime.hashCode() : 0);
        result = 31 * result + (limitEndtime != null ? limitEndtime.hashCode() : 0);
        result = 31 * result + (limitValue != null ? limitValue.hashCode() : 0);
        result = 31 * result + (dareaId != null ? dareaId.hashCode() : 0);
        result = 31 * result + (dareaType != null ? dareaType.hashCode() : 0);
        result = 31 * result + (dstatus != null ? dstatus.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (operId != null ? operId.hashCode() : 0);
        result = 31 * result + (operName != null ? operName.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
