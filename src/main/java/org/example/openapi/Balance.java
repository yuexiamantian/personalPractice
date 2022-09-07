package com.kcwl.ddd.component.pushdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jinyue at 2022/9/2 8:31 上午
 */
@SuppressWarnings("unused")
@Entity
@Table(name = "balance")
public class Balance {

    @Id
    private Long id;

    private BigDecimal balance;

    private Long creator;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Balance() {
    }

    public Balance(Long id, BigDecimal balance, Long creator) {
        this.id = id;
        this.balance = balance;
        this.creator = creator;
    }
}
