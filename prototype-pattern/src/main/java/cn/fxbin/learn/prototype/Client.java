package cn.fxbin.learn.prototype;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/7 11:21
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setAge(11);
        person.setName("小王");
        person.getList().add("aaa");
        person.getList().add("bbb");

        // 浅拷贝
//        Person person1 = person.clone();

        Person person1 = person.deepClone();
        person1.setName("老王");
        person1.getList().add("ccc");

        System.out.println("person: " + person.getName() + "; age: " + person.getAge() + "; list: " + person.getList());
        System.out.println("person1: " + person1.getName() + "; age: " + person1.getAge() + "; list: " + person1.getList());
    }

}
