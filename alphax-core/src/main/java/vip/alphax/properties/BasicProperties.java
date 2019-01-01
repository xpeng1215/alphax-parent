package vip.alphax.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @auther Alpha丶X
 * @create 2018年12月26日 10:10
 * @describe 基本数据
 */
@Component
@ConfigurationProperties(prefix="basic.data",
        ignoreUnknownFields= false)
public class BasicProperties {

    /**
     * @Author Alpha丶X
     * @Date 2018-12-26 16:13:06
     * @Description 授权编码，由权限认证中心分配
     */
    private String appId;

    /**
     * @Author Alpha丶X
     * @Date 2018-12-26 16:13:29
     * @Description 是授权秘钥，由权限认证中心分配
     */
    private String appSecret;

    /**
     * @Author Alpha丶X
     * @Date 2018-12-26 16:13:50
     * @Description 调用第三方接口地址
     */
    private String url;

    /**
     * @Author Alpha丶X
     * @Date 2018-12-26 20:57:45
     * @Description 注册来源
     */
    private String regChannel;

    /**
     * @Author Alpha丶X
     * @Date 2018-12-26 20:58:09
     * @Description 机构代码
     */
    private String institutionCode;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegChannel() {
        return regChannel;
    }

    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

}
