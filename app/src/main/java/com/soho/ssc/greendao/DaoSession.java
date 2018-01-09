package com.soho.ssc.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.soho.ssc.domain.HistoryVideo;

import com.soho.ssc.greendao.HistoryVideoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig historyVideoDaoConfig;

    private final HistoryVideoDao historyVideoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        historyVideoDaoConfig = daoConfigMap.get(HistoryVideoDao.class).clone();
        historyVideoDaoConfig.initIdentityScope(type);

        historyVideoDao = new HistoryVideoDao(historyVideoDaoConfig, this);

        registerDao(HistoryVideo.class, historyVideoDao);
    }
    
    public void clear() {
        historyVideoDaoConfig.clearIdentityScope();
    }

    public HistoryVideoDao getHistoryVideoDao() {
        return historyVideoDao;
    }

}