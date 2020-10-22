package cn.fxbin.learn.chain.lambda;

/**
 * SpellCheckerProcessing
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 17:20
 */
public class SpellCheckerProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String text) {
        return text.replaceAll("labda", "lambda");
    }

}
