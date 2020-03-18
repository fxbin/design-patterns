package cn.fxbin.lock;

import org.I0Itec.zkclient.ZkClient;

import java.util.concurrent.CountDownLatch;

/**
 * AbstractLock
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:08
 */
public abstract class AbstractLock implements Lock {

    /**
     * zookeeper 集群连接地址
     */
    protected String CONNECTION = "127.0.0.1:2181";
    /**
     * zk客户端连接
     */
    protected ZkClient zkClient = new ZkClient(CONNECTION);
    /**
     * lock路径 锁路径
     */
    protected String lockPath = "/lock";

    protected CountDownLatch countDownLatch = new CountDownLatch(1);

    /**
     * 模板方法：定义了获取分布式锁的骨架
     */
    @Override
    public void getLock() {
        //获取锁
        if (tryLock()) {
            System.out.println("####获取锁成功######");
        } else {
            //等待锁
            waitLock();
            //递归获取锁
            getLock();
        }
    }

    // 获取锁
    protected abstract boolean tryLock();

    // 等待锁
    protected abstract void waitLock();

    @Override
    public void unLock() {
        if (zkClient != null) {
            System.out.println("#######释放锁#########");
            zkClient.close();
        }
    }


}
