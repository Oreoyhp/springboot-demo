package com.crsc.domain;

import java.util.Date;

public class YyRenshiYd {
    private Integer id;

    private Integer verson;

    private String username;

    private String usercode;

    private Integer macid;

    private String xj;

    private String groupname;

    private Integer xzlb;

    private Integer teamischeck;

    private Integer isadmin;

    private Integer iscjq;

    private String syqjbgz;

    private String sygwgz;

    private String syjxgz;

    private String syyjjt;

    private String sytotal;

    private String zzjbgz;

    private String zzgwgz;

    private String zzjxgz;

    private String zzyjjt;

    private String zztotal;

    private Integer valid;

    private Integer operatorid;

    private Date cdate;

    private Date udate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVerson() {
        return verson;
    }

    public void setVerson(Integer verson) {
        this.verson = verson;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public Integer getMacid() {
        return macid;
    }

    public void setMacid(Integer macid) {
        this.macid = macid;
    }

    public String getXj() {
        return xj;
    }

    public void setXj(String xj) {
        this.xj = xj;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Integer getXzlb() {
        return xzlb;
    }

    public void setXzlb(Integer xzlb) {
        this.xzlb = xzlb;
    }

    public Integer getTeamischeck() {
        return teamischeck;
    }

    public void setTeamischeck(Integer teamischeck) {
        this.teamischeck = teamischeck;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getIscjq() {
        return iscjq;
    }

    public void setIscjq(Integer iscjq) {
        this.iscjq = iscjq;
    }

    public String getSyqjbgz() {
        return syqjbgz;
    }

    public void setSyqjbgz(String syqjbgz) {
        this.syqjbgz = syqjbgz;
    }

    public String getSygwgz() {
        return sygwgz;
    }

    public void setSygwgz(String sygwgz) {
        this.sygwgz = sygwgz;
    }

    public String getSyjxgz() {
        return syjxgz;
    }

    public void setSyjxgz(String syjxgz) {
        this.syjxgz = syjxgz;
    }

    public String getSyyjjt() {
        return syyjjt;
    }

    public void setSyyjjt(String syyjjt) {
        this.syyjjt = syyjjt;
    }

    public String getSytotal() {
        return sytotal;
    }

    public void setSytotal(String sytotal) {
        this.sytotal = sytotal;
    }

    public String getZzjbgz() {
        return zzjbgz;
    }

    public void setZzjbgz(String zzjbgz) {
        this.zzjbgz = zzjbgz;
    }

    public String getZzgwgz() {
        return zzgwgz;
    }

    public void setZzgwgz(String zzgwgz) {
        this.zzgwgz = zzgwgz;
    }

    public String getZzjxgz() {
        return zzjxgz;
    }

    public void setZzjxgz(String zzjxgz) {
        this.zzjxgz = zzjxgz;
    }

    public String getZzyjjt() {
        return zzyjjt;
    }

    public void setZzyjjt(String zzyjjt) {
        this.zzyjjt = zzyjjt;
    }

    public String getZztotal() {
        return zztotal;
    }

    public void setZztotal(String zztotal) {
        this.zztotal = zztotal;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", verson=").append(verson);
        sb.append(", username=").append(username);
        sb.append(", usercode=").append(usercode);
        sb.append(", macid=").append(macid);
        sb.append(", xj=").append(xj);
        sb.append(", groupname=").append(groupname);
        sb.append(", xzlb=").append(xzlb);
        sb.append(", teamischeck=").append(teamischeck);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", iscjq=").append(iscjq);
        sb.append(", syqjbgz=").append(syqjbgz);
        sb.append(", sygwgz=").append(sygwgz);
        sb.append(", syjxgz=").append(syjxgz);
        sb.append(", syyjjt=").append(syyjjt);
        sb.append(", sytotal=").append(sytotal);
        sb.append(", zzjbgz=").append(zzjbgz);
        sb.append(", zzgwgz=").append(zzgwgz);
        sb.append(", zzjxgz=").append(zzjxgz);
        sb.append(", zzyjjt=").append(zzyjjt);
        sb.append(", zztotal=").append(zztotal);
        sb.append(", valid=").append(valid);
        sb.append(", operatorid=").append(operatorid);
        sb.append(", cdate=").append(cdate);
        sb.append(", udate=").append(udate);
        sb.append("]");
        return sb.toString();
    }
}