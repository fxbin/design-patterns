package cn.fxbin.learn.memento;

/**
 * RoleStateCaretaker
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:51
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
