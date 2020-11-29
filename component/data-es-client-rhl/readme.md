# 官网文档
https://gitee.com/zxporz/ESClientRHL

# 使用
1. 引入组件

2. spring-boot启动类添加注解
@EnableESTools注解能够帮助开发人员自动注入工具服务，简化配置，并引入自动发现es索引结构实体类的功能，识别ESCRepository接口并自动生成代理的功能

@EnableESTools(
basePackages = {"ESCRepository接口包路径数组"},
entityPath = {"实体类包路径数组"},
printregmsg = true)//详见运维功能部分

