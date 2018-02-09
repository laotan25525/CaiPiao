package com.caipiao.quantanliu.caipiao.crawler.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * Created by Brucezz on 2016/01/03.
 * DouyuCrawler
 */
@Entity
public class Danmaku {

    @Id
    private Long id;//数据库id
    @Property
    private int uid;//用户id
    @Property
    private String snick;//昵称
    @Property
    private String content;//内容
    @Property
    private Date date;//发布时间
    @Property
    private int rid;//房间号

    public Danmaku(int uid, String snick, String content, int rid) {
        this.uid = uid;
        this.snick = snick;
        this.content = content;
        this.date = new Date();
        this.rid = rid;
    }

    @Generated(hash = 750813962)
    public Danmaku(Long id, int uid, String snick, String content, Date date,
            int rid) {
        this.id = id;
        this.uid = uid;
        this.snick = snick;
        this.content = content;
        this.date = date;
        this.rid = rid;
    }

    @Generated(hash = 712809626)
    public Danmaku() {
    }

    @Override
    public String toString() {
        return "Danmaku{" +
                "uid=" + uid +
                ", snick='" + snick + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", rid=" + rid +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSnick() {
        return snick;
    }

    public void setSnick(String snick) {
        this.snick = snick;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
