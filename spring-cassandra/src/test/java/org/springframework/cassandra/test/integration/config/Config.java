package org.springframework.cassandra.test.integration.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config extends AbstractIntegrationTestConfiguration {

	@Override
	protected String getKeyspace() {
		return null;
	}
}
