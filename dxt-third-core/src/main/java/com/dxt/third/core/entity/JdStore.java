package com.dxt.third.core.entity;

public class JdStore {
    private String gtaccountid;

    private String gtinvid;

    private String gtinvname;

    private String gtdepotid;

    private String gtdepotname;

    private String nsrinvid;

    private String nsrinvname;

    private String nsrdepotid;

    private String nrsdepotname;

    private String ztdepotid;

    private String ztdepotname;

    public JdStore(String gtaccountid, String gtinvid, String gtinvname, String gtdepotid, String gtdepotname, String nsrinvid, String nsrinvname, String nsrdepotid, String nrsdepotname, String ztdepotid, String ztdepotname) {
        this.gtaccountid = gtaccountid;
        this.gtinvid = gtinvid;
        this.gtinvname = gtinvname;
        this.gtdepotid = gtdepotid;
        this.gtdepotname = gtdepotname;
        this.nsrinvid = nsrinvid;
        this.nsrinvname = nsrinvname;
        this.nsrdepotid = nsrdepotid;
        this.nrsdepotname = nrsdepotname;
        this.ztdepotid = ztdepotid;
        this.ztdepotname = ztdepotname;
    }

    public JdStore() {
        super();
    }

    public String getGtaccountid() {
        return gtaccountid;
    }

    public void setGtaccountid(String gtaccountid) {
        this.gtaccountid = gtaccountid == null ? null : gtaccountid.trim();
    }

    public String getGtinvid() {
        return gtinvid;
    }

    public void setGtinvid(String gtinvid) {
        this.gtinvid = gtinvid == null ? null : gtinvid.trim();
    }

    public String getGtinvname() {
        return gtinvname;
    }

    public void setGtinvname(String gtinvname) {
        this.gtinvname = gtinvname == null ? null : gtinvname.trim();
    }

    public String getGtdepotid() {
        return gtdepotid;
    }

    public void setGtdepotid(String gtdepotid) {
        this.gtdepotid = gtdepotid == null ? null : gtdepotid.trim();
    }

    public String getGtdepotname() {
        return gtdepotname;
    }

    public void setGtdepotname(String gtdepotname) {
        this.gtdepotname = gtdepotname == null ? null : gtdepotname.trim();
    }

    public String getNsrinvid() {
        return nsrinvid;
    }

    public void setNsrinvid(String nsrinvid) {
        this.nsrinvid = nsrinvid == null ? null : nsrinvid.trim();
    }

    public String getNsrinvname() {
        return nsrinvname;
    }

    public void setNsrinvname(String nsrinvname) {
        this.nsrinvname = nsrinvname == null ? null : nsrinvname.trim();
    }

    public String getNsrdepotid() {
        return nsrdepotid;
    }

    public void setNsrdepotid(String nsrdepotid) {
        this.nsrdepotid = nsrdepotid == null ? null : nsrdepotid.trim();
    }

    public String getNrsdepotname() {
        return nrsdepotname;
    }

    public void setNrsdepotname(String nrsdepotname) {
        this.nrsdepotname = nrsdepotname == null ? null : nrsdepotname.trim();
    }

    public String getZtdepotid() {
        return ztdepotid;
    }

    public void setZtdepotid(String ztdepotid) {
        this.ztdepotid = ztdepotid == null ? null : ztdepotid.trim();
    }

    public String getZtdepotname() {
        return ztdepotname;
    }

    public void setZtdepotname(String ztdepotname) {
        this.ztdepotname = ztdepotname == null ? null : ztdepotname.trim();
    }
}