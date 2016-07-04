package ch.mkf.rest.resource;

import java.io.File;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.importer.ZipImporter;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.archive.importer.MavenImporter;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.jayway.restassured.RestAssured.*;

@RunWith(Arquillian.class)
public class TestResourseIT {

    @Deployment
    public static WebArchive createDeployment() {
//        return ShrinkWrap.create(ZipImporter.class, "seam-rest.war")
//        		.importFrom(new File("target/seam-rest.war"))
//        		.as(WebArchive.class);
    	return ShrinkWrap.create(MavenImporter.class).loadPomFromFile("pom.xml").importBuildOutput().as(WebArchive.class);  
    }
    
    @Test
    public void testTestResource() {
    	get("/seam-rest/resources/rest/test/root").then().assertThat().statusCode(200);
    }
}
