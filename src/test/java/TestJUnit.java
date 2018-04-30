package test.java;

import static org.junit.Assert.assertEquals;
import javax.ws.rs.core.Response;
import org.junit.Test;
import com.google.gson.Gson;
import main.java.MessageResource;
import main.java.Package;

public class TestJUnit {
	
	@Test
    public void Test1() {
    	String expectedResult = "{ length: 5.0, width: 5.0, height: 5.0, size: XS }";
    	MessageResource mr = new MessageResource();
    	Gson g = new Gson();
    	
    	Response res = mr.size(expectedResult);
    	String jsonRes = (String) res.getEntity();
    	Package p = g.fromJson(jsonRes, Package.class);
    	
    	assertEquals("XS",p.size);
    	
    }
	
	@Test
    public void Test2() {
    	String expectedResult = "{ length: 8.0, width: 8.0, height: 8.0, size: S }";
    	MessageResource mr = new MessageResource();
    	Gson g = new Gson();
    	
    	Response res = mr.size(expectedResult);
    	String jsonRes = (String) res.getEntity();
    	Package p = g.fromJson(jsonRes, Package.class);
    	
    	assertEquals("S",p.size);
    	
    }
	
	@Test
    public void Test3() {
    	String expectedResult = "{ length: 10.0, width: 10.0, height: 10.0, size: M }";
    	MessageResource mr = new MessageResource();
    	Gson g = new Gson();
    	
    	Response res = mr.size(expectedResult);
    	String jsonRes = (String) res.getEntity();
    	Package p = g.fromJson(jsonRes, Package.class);
    	
    	assertEquals("M",p.size);
    	
    }
	
	@Test
    public void Test4() {
    	String expectedResult = "{ length: 15.0, width: 15.0, height: 15.0, size: L }";
    	MessageResource mr = new MessageResource();
    	Gson g = new Gson();
    	
    	Response res = mr.size(expectedResult);
    	String jsonRes = (String) res.getEntity();
    	Package p = g.fromJson(jsonRes, Package.class);
    	
    	assertEquals("L",p.size);
    	
    }
	
	@Test
    public void Test5() {
    	String expectedResult = "{ length: 20.0, width: 20.0, height: 20.0, size: XL }";
    	MessageResource mr = new MessageResource();
    	Gson g = new Gson();
    	
    	Response res = mr.size(expectedResult);
    	String jsonRes = (String) res.getEntity();
    	Package p = g.fromJson(jsonRes, Package.class);
    	
    	assertEquals("XL",p.size);
    	
    }
    
}
