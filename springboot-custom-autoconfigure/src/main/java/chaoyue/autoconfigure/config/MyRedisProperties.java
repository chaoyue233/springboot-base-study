package chaoyue.autoconfigure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "chaoyue.redis")
public class MyRedisProperties {
    private String host;
    private Integer port;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyRedisProperties{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", password='" + password + '\'' +
                '}';
    }
}
