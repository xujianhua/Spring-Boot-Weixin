### 本Demo基于Spring Boot构建，实现微信公众号开发功能。

-----------------------

## 使用步骤：
1. 配置：`/src/main/resources/application.yml` 文件，根据自己需要填写相关配置（需要注意的是：yml文件内的属性冒号后面的文字之前需要加空格，可参考已有配置，否则属性会设置不成功）；	
1. 运行Java程序：`com.github.xujianhua.demo.wechat.WxMpDemoApplication`；
1. https://www.ngrok.cc/ 提供免费内网穿透服务，本地调试；
1. 配置微信公众号中的接口地址：为ngrok配置的地址；
1. 根据自己需要修改各个handler的实现，加入自己的业务逻辑。
	
### 在[weixin-java-mp](https://gitee.com/binary/weixin-java-mp-demo-springboot)的基础上开发；
1. 修改了程序目录
1. 修复SCAN事件的处理
1. 添加Mybatis + pageHelp

### 更多Demo请查阅：https://github.com/Wechat-Group/weixin-java-tools