package com.wjp.wojcodesandbox;

import com.wjp.wojcodesandbox.model.ExecuteCodeReponse;
import com.wjp.wojcodesandbox.model.ExecuteCodeRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Java原生实现的Code Sandbox【直接复用模板方法】
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {
    @Override
    public ExecuteCodeReponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }



}
