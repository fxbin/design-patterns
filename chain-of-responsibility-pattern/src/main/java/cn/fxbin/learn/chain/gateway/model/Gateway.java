package cn.fxbin.learn.chain.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Gateway
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 16:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gateway implements Serializable {

    /**
     * handler Id
     */
    private Integer handlerId;

    /**
     * 处理者名称
     */
    private String handlerName;

    /**
     * 处理者class name
     */
    private String handlerClassName;

    /**
     * 上一个处理者 handler Id
     */
    private Integer preHandlerId;

    /**
     * 下一个处理者 handler Id
     */
    private Integer nextHandlerId;


}
