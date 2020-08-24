package threadpool;
import java.util.Map;
import java.util.HashMap;

public class ThreadManager {
    public static  final String DEFAULT_SINGLE_POOL_NAME = "DEFAULT_SINGLE_POOL_NAME";
    private static ThreadPoolProxy mLongPool = null;
    private static Object mLongLock = new Object();

    private static ThreadPoolProxy mShotPool = null;
    private static Object mShortLock = new Object();

    private static ThreadPoolProxy mDownloadPool = null;
    //private static Object mDownloadPool = new Object();

    private static Map<String,ThreadPoolProxy> mMap = new HashMap<String,ThreadPoolProxy>();
}