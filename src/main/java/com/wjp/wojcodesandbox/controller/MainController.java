package com.wjp.wojcodesandbox.controller;

import com.wjp.wojcodesandbox.JavaNativeCodeSandbox;
import com.wjp.wojcodesandbox.JavaNativeCodeSandboxOld;
import com.wjp.wojcodesandbox.model.ExecuteCodeReponse;
import com.wjp.wojcodesandbox.model.ExecuteCodeRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/")
public class MainController {

    @Resource
    private JavaNativeCodeSandbox javaNativeCodeSandbox;

    @Resource
    private JavaNativeCodeSandboxOld javaNativeCodeSandboxOld;

    @GetMapping("/health")
    public String healthCheck(){
        return "ok";
    }


    @PostMapping("/executeCode")
    ExecuteCodeReponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest) {
        if(executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }

        return javaNativeCodeSandbox.executeCode(executeCodeRequest);
    }

}
