package cn.fxbin.learn.builder;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/7 14:01
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        Computer lowComputer = director.create(new LowComputerBuilder());
        Computer highComputer = director.create(new HighComputerBuilder());

        System.out.println(lowComputer);
        System.out.println(highComputer);
    }

}
