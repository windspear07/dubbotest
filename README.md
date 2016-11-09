
#Simple example for using dubbo

##1 start zookeeper
download zookeeper 3.4.8.
go to the zookeeper conf directory
>cp zoo_sample.cfg zoo.cfg

to bin,
>./zkServer.sh start

##2 prepare dubbo-admin.war
git clone: https://github.com/alibaba/dubbo.git
some usful info here.

>cd ~/dubbo

>mvn clean install -Dmaven.test.skip

deploy the war to tomcat ROOT
visit /index.html
##3 run project code


##4 todos
###(1) dubbo docs
###(2) zookeeper configs
