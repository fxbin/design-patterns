package cn.fxbin.learn.command.demo;

/**
 * ConcreteCommand
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:05
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand --- execute");
        this.receiver.doSomething();
    }

}
