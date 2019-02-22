阿里巴巴中间件 公众号内的清铭的文章.

0.找不到jar的话,就在
    https://maven.aliyun.com/mvn/search

1. nacos 后台启动命令:

    nohup sh startup.sh -m standalone &

2. 初始化 fescar 的配置

    sh nacos-config.sh 118.24.157.96
    nohup sh fescar-server.sh 8091 /usr/local/software/fescar-server/data 118.24.157.96 &
    nohup sh fescar-server.sh 8091 /usr/data 118.24.157.96 &

1.fescar-server 设置:
进入到 Fescar-Server 解压目录 conf 文件夹下 registry.conf 修改 type="nacos" 并配置 Nacos 的相关属性。
registry {
  # file nacos
  type = "nacos"
  nacos {
    serverAddr = "localhost"
    namespace = "public"
    cluster = "default"
  }
  file {
    name = "file.conf"
  }
}
type: 可配置为 nacos 和 file，配置为 file 时无服务注册功能
nacos.serverAddr: Nacos-Sever 服务地址(不含端口号)
nacos.namespace: Nacos 注册和配置隔离 namespace
nacos.cluster: 注册服务的集群名称
file.name: type = "file" classpath 下配置文件名



