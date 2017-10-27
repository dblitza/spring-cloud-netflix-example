package pl.piomin.microservices.customer.intercomm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.piomin.microservices.customer.model.Account;

@Component
public class AccountClientFallback implements AccountClient {

	@Override
	public List<Account> getAccounts(Integer customerId) {
		
		List<Account> accounts;
		accounts = new ArrayList<>();
		accounts.add(new Account(1, "111111"));
		accounts.add(new Account(2, "222222"));
		accounts.add(new Account(3, "333333"));
		accounts.add(new Account(4, "444444"));
		accounts.add(new Account(1, "555555"));
		accounts.add(new Account(2, "666666"));
		accounts.add(new Account(2, "777777"));
		return accounts;
	}
}