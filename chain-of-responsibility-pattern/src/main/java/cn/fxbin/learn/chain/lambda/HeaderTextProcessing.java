package cn.fxbin.learn.chain.lambda;

/**
 * HeaderTextProcessing
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 17:20
 */
public class HeaderTextProcessing extends ProcessingObject<String>  {

    @Override
    protected String handleWork(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }

}
