package cn.fxbin.learn.memento;

/**
 * RoleStateMemente
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:47
 */
public class RoleStateMemento {

    /**
     * 生命力, 100, 会下降
     */
    private int live;

    /**
     * 攻击力
     */
    private int attack;

    public RoleStateMemento(int live, int attack) {
        this.live = live;
        this.attack = attack;
    }


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
}
