package threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolProxy {
    private ThreadPoolExecutor mPool;
    private int mCorePoolSize;
    private int mMaximumPoolSize;
    private long mKeepAliveTime;

    private ThreadPoolProxy(int corePoolSize,int maximumPoolSize,long keepAliveTime){
        mCorePoolSize = corePoolSize;
        mMaximumPoolSize = maximumPoolSize;
        mKeepAliveTime = keepAliveTime;
    }
    public synchronized void execute(Runnable run) {
        if (run == null) {
            return;
        }
        if (mPool == null || mPool.isShutdown()){
            mPool = new ThreadPoolExecutor(mCorePoolSize,mMaximumPoolSize,mKeepAliveTime, TimeUnit.MICROSECONDS,new LinkedBlockingQueue<Runnable>(), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        }
        mPool.execute(run);
    }
    public synchronized void canceld(Runnable run){
        if (mPool !=null&&(!mPool.isShutdown()||mPool.isShutdown()||mPool.isTerminating())){
            mPool.getQueue().remove(run);
        }
    }

}
