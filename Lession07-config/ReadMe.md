# SpringBoot Config



## 文件格式

1. properties（优先）
   1. key=value
2. yml或yaml
   1. key: value

## Environment

所有的key和value，使用getProperty

**多文件**：使用spring.config.import=文件路径，多个用**,**隔开

**多环境**：开发环境，测试环境，上线，特性，bug等等

1. 名称：application-环境.properties(yml)，可以配置多个环境文件
2. 创建环境文件：使用
   1. Spring.config.activate.on-profile:环境名称
3. 激活环境：使用
   1. spring.profiles.active:环境名称

读取数据：@Value(${"key"})

使用Environment.getProperty("key")：获取的是单个值