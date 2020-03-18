package cn.fxbin.lock.zookeeper;

import cn.fxbin.lock.AbstractLock;
import org.I0Itec.zkclient.IZkDataListener;

import java.util.concurrent.CountDownLatch;

/**
 * ZookeeperLock
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:09
 */
public class ZookeeperLock extends AbstractLock {
    @Override
    protected boolean tryLock() {
        try {
            zkClient.createEphemeral(lockPath);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void waitLock() {
        // 使用zk临时事件监听
        IZkDataListener iZkDataListener = new IZkDataListener() {

            @Override
            public void handleDataDeleted(String path) throws Exception {
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }

            @Override
            public void handleDataChange(String arg0, Object arg1) throws Exception {

            }
        };
        // 注册事件通知
        zkClient.subscribeDataChanges(lockPath, iZkDataListener);
        if (zkClient.exists(lockPath)) {
            countDownLatch = new CountDownLatch(1);
            try {
                countDownLatch.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 监听完毕后，移除事件通知
        zkClient.unsubscribeDataChanges(lockPath, iZkDataListener);
    }
}
