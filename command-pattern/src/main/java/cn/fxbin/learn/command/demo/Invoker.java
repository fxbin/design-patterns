package cn.fxbin.learn.command.demo;

/**
 * Invoker
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:06
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }
}
