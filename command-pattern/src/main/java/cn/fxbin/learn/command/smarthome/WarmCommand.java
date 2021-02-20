package cn.fxbin.learn.command.smarthome;

/**
 * WarmCommand
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:14
 */
public class WarmCommand implements Command {

    /**
     * 对 receiver 进行命令处理
     */
    private ConditionReceiver receiver;

    public WarmCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 实现命令调用
     */
    @Override
    public void execute() {
        System.out.println("WarmCommand ---> execute ");
        receiver.off();
    }
}
