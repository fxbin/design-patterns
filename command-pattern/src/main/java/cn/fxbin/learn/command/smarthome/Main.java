package cn.fxbin.learn.command.smarthome;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:19
 */
public class Main {

    public static void main(String[] args) {

        ConditionReceiver receiver = new ConditionReceiver();

        Command onCommand = new OnCommand(receiver);
        Command coolCommand = new CoolCommand(receiver);
        Command warmCommand = new WarmCommand(receiver);
        Command offCommand = new OffCommand(receiver);

        AppInvoker appInvoker = new AppInvoker();
        appInvoker.setOnCommand(onCommand);
        appInvoker.setCoolCommand(coolCommand);
        appInvoker.setWarmCommand(warmCommand);
        appInvoker.setOffCommand(offCommand);

        appInvoker.on();
        appInvoker.cool();
        appInvoker.warm();
        appInvoker.off();

    }

}
