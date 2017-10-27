package pl.piomin.microservices.customer.intercomm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import pl.piomin.microservices.customer.model.Account;

@FeignClient(name = "account-service", fallback = AccountClientFallback.class)
@Service
public interface AccountClient {

    @RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customerId}")
    List<Account> getAccounts(@PathVariable("customerId") Integer customerId);
   
        
}


