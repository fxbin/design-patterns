package cn.fxbin.learn.memento;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:52
 */
public class Main {

    public static void main(String[] args) {
        RoleOriginator role = new RoleOriginator();
        role.display();
        role.fight();
        role.display();
        System.out.println("保存快照");

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.saveState());

        role.fight();
        role.fight();
        role.fight();
        role.fight();
        role.display();

        System.out.println("恢复快照");
        role.recoveryState(caretaker.getMemento());
        role.display();

    }

}
