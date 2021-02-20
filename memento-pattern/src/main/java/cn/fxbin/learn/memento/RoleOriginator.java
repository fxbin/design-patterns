package cn.fxbin.learn.memento;

/**
 * RoleOriginator
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:43
 */
public class RoleOriginator {

    /**
     * 生命力, 100, 会下降
     */
    private int live = 100;

    /**
     * 攻击力
     */
    private int attack = 50;

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void display() {
        System.out.println("开始======");
        System.out.println("生命力：" + live);
        System.out.println("攻击力：" + attack);
        System.out.println("结束======");
    }

    public void fight() {
        // 攻击力上涨
        this.attack = attack + 2;
        // 生命力下降
        this.live = live - 10;
    }

    /**
     * 保存快照
     * @return
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(live, attack);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.attack = memento.getAttack();
        this.live = memento.getLive();
    }




}
