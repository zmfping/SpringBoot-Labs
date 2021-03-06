package cn.iocoder.springboot.lab65.userservice.endpoint;

import cn.iocoder.springboot.lab65.userservice.config.WebServiceConfig;
import cn.iocoder.springboot.lab65.userservice.model.UserGetRequest;
import cn.iocoder.springboot.lab65.userservice.model.UserGetResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

	@PayloadRoot(namespace = WebServiceConfig.NAMESPACE_URI, localPart = "UserGetRequest")
	@ResponsePayload
	public UserGetResponse get(@RequestPayload UserGetRequest request) {
        UserGetResponse response = new UserGetResponse();
        response.setId(request.getId());
        response.setName("没有昵称：" + request.getId());
        response.setGender(request.getId() % 2 + 1);
		return response;
	}

}
