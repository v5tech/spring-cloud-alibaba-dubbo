# Docker 安装 Nacos

安装

```bash
git clone https://github.com/nacos-group/nacos-docker.git
cd nacos-docker
docker-compose -f example/standalone-mysql.yaml up
```

访问

http://127.0.0.1:8848/nacos/

默认账号密码为 nacos/nacos