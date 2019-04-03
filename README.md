# swagger-sample
自动化生成API文档

## 说明  
基于`swagger-maven-plugin`、`swagger2markup-maven-plugin`、`asciidoctor-maven-plugin` 插件生成HTML、PDF格式API文档


插件一
``` xml
<plugin>
    <groupId>com.github.kongchen</groupId>
    <artifactId>swagger-maven-plugin</artifactId>
    <version>3.1.8</version>
</plugin>
```

用于生成swagger规范的json文件  

插件二   
```xml
<plugin>
    <groupId>io.github.swagger2markup</groupId>
    <artifactId>swagger2markup-maven-plugin</artifactId>
    <version>${swagger2markup.plugin.version}</version>
</plugin>
```
使用插件一生成的swagger规范的json文件 生成asciidoc文件  

插件三
```xml
<plugin>
    <groupId>org.asciidoctor</groupId>
    <artifactId>asciidoctor-maven-plugin</artifactId>
    <version>1.5.7.1</version>
</plugin>
```
利用asciidoc文件 生成HTML、PDF文档