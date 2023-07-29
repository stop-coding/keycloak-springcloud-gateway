# keycloak-springcloud-gateway


## 构建
java -jar target/kc-gateway-3.0.0.jar --spring.config.location=`pwd`/config/

```
docker build -t kcgateway:dev -f Dockerfile .
```


## 重定向url

http://localhost:8080/login/oauth2/code/client-id