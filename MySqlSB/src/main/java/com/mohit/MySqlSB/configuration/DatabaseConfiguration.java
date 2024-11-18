package com.mohit.MySqlSB.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfiguration {

	@Bean
	public DataSource getDataSource() {
	    JndiDataSourceLookup sourceLookup = new JndiDataSourceLookup();
	    sourceLookup.setResourceRef(true);
	    try {
	        return sourceLookup.getDataSource("java:comp/env/MySqlSB");

//Add below property in context.xml
//	    	<ResourceLink name="Media" global="Media" type="javax.sql.DataSource" />
//Add below property in <GlobalNamingResources> tag of server.xml
//			<Resource auth="Container" driverClassName="com.mysql.cj.jdbc.Driver" name="Media" password="Mysql@123" type="javax.sql.DataSource" url="jdbc:mysql://localhost:3306/sys" username="root"/>

	    } catch (Exception e) {
	        e.printStackTrace();
	        throw new RuntimeException("Failed to look up JNDI DataSource", e);
	    }
	}
}
