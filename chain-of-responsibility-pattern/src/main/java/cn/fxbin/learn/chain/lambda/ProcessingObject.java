package cn.fxbin.learn.chain.lambda;

/**
 * ProcessingObject
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 17:16
 */
public abstract class ProcessingObject<T> {
    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }

    public T handle(T input) {
        T r = handleWork(input);
        if (successor != null) {
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);

}
