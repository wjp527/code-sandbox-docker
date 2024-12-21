package com.wjp.wojcodesandbox;


import com.wjp.wojcodesandbox.model.ExecuteCodeReponse;
import com.wjp.wojcodesandbox.model.ExecuteCodeRequest;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */

    ExecuteCodeReponse executeCode(ExecuteCodeRequest executeCodeRequest) throws InterruptedException;
}
