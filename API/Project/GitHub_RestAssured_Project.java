import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class GitHub_RestAssured_Project {
	RequestSpecification requestspec;
	ResponseSpecification responsespec;
    String SSHkey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC5GKL+yMX/tf4Aby86jiORlkKxBFFdYCkMM6qRL/mLjE28IbaWOnTsqwJ5bM6ErWCqHgsXOKIFC/lTw6+mfb/KKJzOBQ0No6PZcRMALkV2lQXYhJ6GyXzjp/pms6M0htknnfFUkwjBOtJrPeBqoIsLCFU8qYXgRom57qJ9k/9sSSsZE4y4fUfmYROlA7YWP431aE3WOr6iTSAUD6hIlo7ltckk6PZpGvQDSnMGxYICi2IDjLoqMHWvFMMxOwZzaGbCB0qcj1fLB1GegQyH3fwNA1rtevVUyYFg0oTwJFODSrldewl4/JDuDMUH8wkMJAKrcEVJU8uCiKmI8s5n84eewt6Xm3K4avuLNX5+M4WhN9xRSPIAWBMJzSh0tS+iBOnWDLwGwuW24TtcCS0hg47IeVvZmi2xWs37UoTXkp5HxPxk+oi4ZdzJzad1CtDuBlxX9Gd59tBrtKXBrA3YIm7AJo93KQwVIIhhzNjzvoQkcPhLVTYN2pxkCKPBJEfuC/c=";
    int sshid;
    @BeforeClass
    public void setup()
    {
    	requestspec = new RequestSpecBuilder()
    			.setContentType(ContentType.JSON)
    			.setBaseUri("https://api.github.com")
    			.addHeader("Authorization","token ghp_vhFixpa76DsuixKbnTmOsJpr8i9OsI0ygx2Y")
    			.build();
    }	
@Test (priority=1)
public void postreq()
{
	String reqbody = "{\"title\": \"TestB11\", \"key\": \"" + SSHkey + "\" }";
	Response response = given().spec(requestspec).body(reqbody).when().post("/user/keys");
	String resbody = response.getBody().asPrettyString();
	System.out.println(reqbody);
	System.out.println(resbody);
	sshid = response.then().extract().path("id");
	System.out.println("id generated is " + sshid);
	
	response.then().statusCode(201);
}
@Test (priority=2)
public void getreq()
{
	 Response response = given().spec(requestspec).when().get("/user/keys");
	String resbody2 = response.getBody().asPrettyString();
	System.out.println(resbody2);
	response.then().statusCode(200);
}
@Test (priority=3)
public void delreq()
{
	 Response response = given().spec(requestspec).pathParam("keyId",sshid).when().delete("/user/keys/{keyId}");
	String resbody3 = response.getBody().asPrettyString();
	System.out.println(resbody3);
	response.then().statusCode(204);
}
}