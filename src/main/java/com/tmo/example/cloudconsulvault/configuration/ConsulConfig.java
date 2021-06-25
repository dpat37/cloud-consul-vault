package com.tmo.example.cloudconsulvault.configuration;

import com.tmo.example.cloudconsulvault.model.TestProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
@ConfigurationProperties("apps")
public class ConsulConfig {

    @Value("${spring.cloud.consul.token:${consul.token:null}}")
    private String token;
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public TestProperty getValue(){return new TestProperty(test, token);}
}
