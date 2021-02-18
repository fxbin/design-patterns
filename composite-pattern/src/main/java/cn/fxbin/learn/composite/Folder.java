package cn.fxbin.learn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Folder
 *
 * <p>
 *     具体的文件夹，里面可以添加子文件夹或者文件
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 14:45
 */
public class Folder extends Root {

    List<Root> folders = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public List<Root> getFolders() {
        return folders;
    }

    public void setFolders(List<Root> folders) {
        this.folders = folders;
    }

    @Override
    public void addFile(Root root) {
        folders.add(root);
    }

    @Override
    public void removeFile(Root root) {
        folders.remove(root);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        //打印横线和当前文件名
        System.out.println(sb.toString() + this.getName());

        for(Root r : folders){
            //每个下级，横线多2个
            r.display(depth+2);
        }
    }
}
