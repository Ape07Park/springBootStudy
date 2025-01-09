package com.example.learn_spring_boot;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// * 설정해야 할 것이 많은 경우 ConfigurationProperties를 이용해 설정을 한다
// properties에서 설정한 걸 여기로 불러옴
//currency-service.url=
//currency-service.username=
//currency-service.key=
@ConfigurationProperties(prefix = "currency-service") // 앞에가 currency-service로 시작하는 것들 여기서 설정함
@Component
public class CurrencyServiceConfiguration {

    //currency-service.url=
    private String url;

    //currency-service.username=
    private String username;

    //currency-service.key=
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
