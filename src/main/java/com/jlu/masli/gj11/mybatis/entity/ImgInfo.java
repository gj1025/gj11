package com.jlu.masli.gj11.mybatis.entity;

import java.util.Date;

public class ImgInfo {
    private Integer imgId;

    private String uploadUserId;

    private String imgTitle;

    private Integer systemType;

    private Integer imgType;

    private String imgUrl;

    private String linkUrl;

    private Integer showState;

    private Date createDate;

    private Date updateDate;

    private String remark;

    private String bEnable;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId == null ? null : uploadUserId.trim();
    }

    public String getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle == null ? null : imgTitle.trim();
    }

    public Integer getSystemType() {
        return systemType;
    }

    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public Integer getShowState() {
        return showState;
    }

    public void setShowState(Integer showState) {
        this.showState = showState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getbEnable() {
        return bEnable;
    }

    public void setbEnable(String bEnable) {
        this.bEnable = bEnable == null ? null : bEnable.trim();
    }
}
