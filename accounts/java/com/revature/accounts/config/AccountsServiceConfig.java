package com.revature.accounts.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix="accounts")
@Getter @Setter @ToString
public class AccountsServiceConfig {

	private String msg;
	private String buildVersion;
	private Map<String, String> mapDetails;
	private List<String>activeBranches;
}
