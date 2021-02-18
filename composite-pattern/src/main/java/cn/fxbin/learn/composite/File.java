package cn.fxbin.learn.composite;

/**
 * File
 *
 * <p>
 *     没有节点，不用存储其他子类数组，所以是叶子节点
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 14:52
 */
public class File extends Root {

    public File(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        //打印横线和当前文件名
        System.out.println(sb.toString() + this.getName());
    }
}
