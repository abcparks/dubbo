nacos启动

```cmd
startup.cmd -m standalone
```



dubbo admin 打包并运行

```maven
mvn clean package -D maven.test.skip=true

mvn --projects dubbo-admin-server spring-boot:run
```



http://172.28.200.33:8848/nacos/index.html

http://localhost:8080/#/service?filter=%2a&pattern=service