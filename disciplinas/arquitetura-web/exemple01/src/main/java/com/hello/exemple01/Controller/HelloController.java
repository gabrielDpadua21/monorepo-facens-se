package com.hello.exemple01.Controller;

import com.hello.exemple01.Entitys.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("appName")
    private String appName;

    @Autowired
    @Qualifier("appVersion")
    private String appVersion;

    @GetMapping(value="/")
    public Version getMethodName() {
        Version app = new Version(appName, appVersion);
        return app;
    }
}
