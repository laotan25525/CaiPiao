package com.caipiao.quantanliu.caipiao.bean;

import com.caipiao.quantanliu.caipiao.crawler.bean.Danmaku;
import com.caipiao.quantanliu.caipiao.crawler.bean.DaoSession;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.ArrayList;
import java.util.List;
import com.caipiao.quantanliu.caipiao.crawler.bean.DanmakuDao;

@Entity
public class WinningHistory {
    @Id
    private Long id;
    @Property
    private long phase;
    @Property
    private int winningNumberOne;
    @Property
    private int winningNumberTwo;
    @Property
    private int winningNumberThree;
    @Property
    private int winningNumberFour;
    @Property
    private int winningNumberFive;
    @Property
    private int winningNumberSix;
    @Property
    private int winningNumberBlue;
    @ToMany(referencedJoinProperty = "uid")
    private List<Danmaku> winningUserlist = new ArrayList<>();
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1402615471)
    private transient WinningHistoryDao myDao;

    @Generated(hash = 1310987087)
    public WinningHistory(Long id, long phase, int winningNumberOne, int winningNumberTwo, int winningNumberThree, int winningNumberFour, int winningNumberFive, int winningNumberSix, int winningNumberBlue) {
        this.id = id;
        this.phase = phase;
        this.winningNumberOne = winningNumberOne;
        this.winningNumberTwo = winningNumberTwo;
        this.winningNumberThree = winningNumberThree;
        this.winningNumberFour = winningNumberFour;
        this.winningNumberFive = winningNumberFive;
        this.winningNumberSix = winningNumberSix;
        this.winningNumberBlue = winningNumberBlue;
    }

    @Generated(hash = 1248697362)
    public WinningHistory() {
    }

    @Override
    public String toString() {
        return "WinningHistory{" + "phase=" + phase + ", winningNumberOne=" + winningNumberOne + ", winningNumberTwo=" + winningNumberTwo + ", winningNumberThree=" + winningNumberThree + ", winningNumberFour=" + winningNumberFour + ", winningNumberFive=" + winningNumberFive + ", winningNumberSix=" + winningNumberSix + ", winningNumberBlue=" + winningNumberBlue + ", winningUserlist=" + winningUserlist + '}';
    }

    public long getPhase() {
        return phase;
    }

    public void setPhase(long phase) {
        this.phase = phase;
    }

    public int getWinningNumberOne() {
        return winningNumberOne;
    }

    public void setWinningNumberOne(int winningNumberOne) {
        this.winningNumberOne = winningNumberOne;
    }

    public int getWinningNumberTwo() {
        return winningNumberTwo;
    }

    public void setWinningNumberTwo(int winningNumberTwo) {
        this.winningNumberTwo = winningNumberTwo;
    }

    public int getWinningNumberThree() {
        return winningNumberThree;
    }

    public void setWinningNumberThree(int winningNumberThree) {
        this.winningNumberThree = winningNumberThree;
    }

    public int getWinningNumberFour() {
        return winningNumberFour;
    }

    public void setWinningNumberFour(int winningNumberFour) {
        this.winningNumberFour = winningNumberFour;
    }

    public int getWinningNumberFive() {
        return winningNumberFive;
    }

    public void setWinningNumberFive(int winningNumberFive) {
        this.winningNumberFive = winningNumberFive;
    }

    public int getWinningNumberSix() {
        return winningNumberSix;
    }

    public void setWinningNumberSix(int winningNumberSix) {
        this.winningNumberSix = winningNumberSix;
    }

    public int getWinningNumberBlue() {
        return winningNumberBlue;
    }

    public void setWinningNumberBlue(int winningNumberBlue) {
        this.winningNumberBlue = winningNumberBlue;
    }

    @Keep
    public List<Danmaku> getWinningUserlist() {
        return winningUserlist;
    }

    public void setWinningUserlist(List<Danmaku> winningUserlist) {
        this.winningUserlist = winningUserlist;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1345781001)
    public synchronized void resetWinningUserlist() {
        winningUserlist = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 361952568)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getWinningHistoryDao() : null;
    }
}