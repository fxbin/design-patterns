package cn.fxbin.learn.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * WebSiteFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 17:37
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebSite> map = new HashMap<>();

    public CloudWebSite getWebSiteByCategory(String category) {
        if (map.containsKey(category)) {
            return map.get(category);
        } else {
            ConcreteWebSite site = new ConcreteWebSite(category);
            map.put(category, site);
            return site;
        }
    }

    public int getWebSiteSize() {
        return map.size();
    }

}
