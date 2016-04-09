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



Spring Boot使我们更容易去创建基于Spring的独立和产品级的可以”即时运行“的应用和服务。支持约定大于配置，目的是尽可能快地构建和运行Spring应用。
 
之前我们创建基于Spring的项目需要考虑添加哪些Spring依赖和第三方的依赖。使用Spring Boot后，我们可以以最小化的依赖开始spring应用。大多数Spring Boot应用需要很少的配置即可运行，比如我们可以创建独立独立大Java应用，然后通过java -jar运行启动或者传统的WAR部署。其也提供了命令行工具来直接运行Spring脚本（如groovy脚本）。也就是说Spring Boot让Spring应用从配置到运行变的更加简单，但不对Spring本身提供增强（即额外的功能）。
 
目的：
让所有Spring开发变得更快，且让更多的人更快的进行Spring入门体验，提供“starter” POM来简化我们的Maven配置（也就是说使用Spring Boot只有配合maven/gradle等这种依赖管理工具才能发挥它的能力），不像以前，构建一个springmvc项目需要进行好多配置等
开箱即用，快速开始需求开发而不被其他方面影响（如果可能会自动配置Spring）
 
提供一些非功能性的常见的大型项目类特性（如内嵌服务器、安全、度量、健康检查、外部化配置），如可以直接地内嵌Tomcat/Jetty（不需要单独去部署war包）
绝无代码生成，且无需XML配置
 
 
 我的构建环境
JDK 7
Maven 3
Servlet3容器 
 
创建项目
首先使用Maven创建一个普通Maven应用即可，不必是web的。
