
simple example for using dubbo

##1 start zookeeper
下载zookeeper 3.4.8.
conf目录，
>cp zoo_sample.cfg zoo.cfg

bin,
>./zkServer.sh start

##2 prepare dubbo-admin.war
git clone: https://github.com/alibaba/dubbo.git
some usful info here.

>cd ~/dubbo
>mvn clean install -Dmaven.test.skip

deploy the war to tomcat ROOT
访问 /index.html
##3 run project code
