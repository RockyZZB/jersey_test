package service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//类似于springmvc中添加requestmapping("hello")
@Path("hello")
public class HelloService {
	//get请求
	@GET
	//表示该方法的相应类型为text/plain
	//该方法返回string,这个string会自动按照text/plain格式输出
	@Produces(MediaType.TEXT_HTML)
	public String hi(){
		return "hello jersey";
	}
}
