package org.loversAPP.model;

import org.loversAPP.base.BaseModel;

import java.util.Date;

public class Moment extends BaseModel {
    private Integer id;

    private Integer userid;

    private Integer momenttype;

    private String momentcontent;

    private String momentimage;

    private Date momentdate;

    private Integer commentid;

    private String  username;

    private String  avatar;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMomenttype() {
        return momenttype;
    }

    public void setMomenttype(Integer momenttype) {
        this.momenttype = momenttype;
    }

    public String getMomentcontent() {
        return momentcontent;
    }

    public void setMomentcontent(String momentcontent) {
        this.momentcontent = momentcontent == null ? null : momentcontent.trim();
    }

    public String getMomentimage() {
        return momentimage;
    }

    public void setMomentimage(String momentimage) {
        this.momentimage = momentimage == null ? null : momentimage.trim();
    }

    public Date getMomentdate() {
        return momentdate;
    }

    public void setMomentdate(Date momentdate) {
        this.momentdate = momentdate;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }
}