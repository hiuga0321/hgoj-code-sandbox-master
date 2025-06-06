package com.hg.hgojcodesandbox;


import com.hg.hgojcodesandbox.model.ExecuteCodeRequest;
import com.hg.hgojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
