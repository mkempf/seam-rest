# seam-rest
Explorational repository to integrate REST interface in an application build on JBoss Seam

## stack
The application shows how to combine the following technologies:
* JBoss Seam 2.3.1
* JBoss RestEasy 2.0.1 through jboss-seam-resteasy
* Jackson2
* Jackson Data Binding for JSR310
* Using Spring 4.1.6 together with Seam

## challenges
According to [JBoss Seam Documentation] there are two different possibilities to inject Spring components into seam components. With spring4 only the injection of spring beans to seam components using el-expression in @In annotation is working.
The <seam:component/> tag in an spring application configuration xml is not working as it tries to use the deprecated method ClassUtils.fromName(String name) from spring to instantiate the component in SeamNamespaceHandler (jboss-seam-ioc).

## things to try
* analysis of accessing different scoped seam component from the a rest call
* using [Context management for custom servlets](https://docs.jboss.org/seam/latest/reference/html_single/#d0e24317) to provide conversation context

## links
* [JBoss Seam Documentation] 
* [RestEasy in JBoss Seam](http://www.seamframework.org/service/File/109634.pdf)
* [JBoss Seam RestEasy Source](http://grepcode.com/file/repository.jboss.org/nexus/content/repositories/releases/org.jboss.seam/jboss-seam-resteasy/2.3.1.Final/org/jboss/seam/resteasy/ResteasyBootstrap.java#ResteasyBootstrap.findSeamComponents%28%29)

[JBoss Seam Documentation]: https://docs.jboss.org/seam/latest/reference/html_single/

