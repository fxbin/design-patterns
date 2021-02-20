package cn.fxbin.learn.command.smarthome;

/**
 * OnCommand
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:14
 */
public class OnCommand implements Command {

    /**
     * 对 receiver 进行命令处理
     */
    private ConditionReceiver receiver;

    public OnCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 实现命令调用
     */
    @Override
    public void execute() {
        System.out.println("OnCommand ---> execute ");
        receiver.on();
    }
}
