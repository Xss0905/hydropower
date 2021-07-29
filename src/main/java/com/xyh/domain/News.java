package com.xyh.domain;

import java.util.Date;

public class News {
    private Integer id;

    private String content;

    private Date createtime;

    private String createtimestring;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatetimestring() {
        return createtimestring;
    }

    public void setCreatetimestring(String createtimestring) {
        this.createtimestring = createtimestring == null ? null : createtimestring.trim();
    }
}