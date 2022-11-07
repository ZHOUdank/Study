git init

git add README.md (没有建README.md的用git add .)

git commit -m "first commit"

git remote add origin https://git@github.com:ZHOUdank/Demo.git

git push -u origin master

### 插件 `.ignore` 可以过滤一些文件不再多次提交

1.`format`的学习使用

2.`socket`的学习使用，还要看

3.在代码中关于`log.info`的打印，一般在`pom.xml`中导入`lombokjar`包即可，类上边加上`@Slf4j`就可以了