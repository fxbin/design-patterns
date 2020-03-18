package cn.fxbin.learn.template;

/**
 * AbstractTemplate
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 16:55
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    public final void templateMethod(){
        operation1();//操作一：共同行为，直接在父类中实现
        operation2();//操作二：共同行为，直接在父类中实现
        operation3();//操作一：不同行为，定义为抽象方法
    }

    //操作三
    protected void operation3(){
        //空实现
    }

    protected void operation1() {
        System.out.println("操作一");
    }

    protected void operation2() {
        System.out.println("操作二");
    }

}
