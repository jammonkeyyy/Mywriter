# Mywriter


1.为pom.xml添加一些依赖以解决demo中运行时存在相关的包无法import的问题
________________________________________________________________
添加了以下
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.0</version>
        </dependency>

        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-impl</artifactId>
            <version>2.3.0</version>
        </dependency>

        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-core</artifactId>
            <version>2.3.0</version>
        </dependency>

        <dependency>
            <groupId>javax.activation</groupId>
            <artifactId>activation</artifactId>
            <version>1.1.1</version>
        </dependency>
2.添加Mywriter类，实现将文件写为txt文件的方法，保存在xml/outputs/report.txt
_______________________________________________________________________
3.修改job-hello-world.xml
