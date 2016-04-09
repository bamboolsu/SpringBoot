# SpringBoot
一个最简单的spring boot  demo程序；


说明：
1， 如何导入工程：   import---> exist maven project -->> 导入成功就可以了；

2， 如何运行工程， 
     邮件  Application 类， 然后 java application方式运行，  
     
3， 如何访问：
   http://localhost:8080/user/2
    http://localhost:8080/user/3
    http://localhost:8080/user/id
    



一个基本的REST风格的web应用就构建完成了。
 
地址栏输入http://localhost:8080/user/1即可看到json结果。
 
 
如果大家查看其依赖，会发现自动添加了需要相应的依赖（不管你用/不用），但是开发一个应用确实变得非常快速，对于想学习/体验Spring的新手，快速建立项目模型等可以考虑用这种方式。当然如果不想依赖这么多的jar包，可以去掉parent，然后自己添加依赖。 




继承spring-boot-starter-parent后我们可以继承一些默认的依赖，这样就无需添加一堆相应的依赖，把依赖配置最小化；spring-boot-starter-web提供了对web的支持，spring-boot-maven-plugin提供了直接运行项目的插件，我们可以直接mvn spring-boot:run运行。




