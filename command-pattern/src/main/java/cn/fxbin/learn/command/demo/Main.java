package cn.fxbin.learn.command.demo;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:07
 */
public class Main {

    public static void main(String[] args) {
        // 接受者
        Receiver receiver = new Receiver();
        // 创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        // 创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        // 执行方法
        invoker.action();
    }

}
