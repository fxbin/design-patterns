package cn.fxbin.learn.builder;

/**
 * LowComputerBuilder
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/7 13:56
 */
public class HighComputerBuilder implements Builder{

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("高配 CPU");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("高配 主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("高配 磁盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("高配 电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("高配 内存");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
