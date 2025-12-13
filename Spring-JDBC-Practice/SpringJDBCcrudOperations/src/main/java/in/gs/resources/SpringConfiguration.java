package in.gs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfiguration {
	@Bean
	public DriverManagerDataSource mydataSource() {
		DriverManagerDataSource dSource = new DriverManagerDataSource();
		dSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		dSource.setUsername("root");
		dSource.setPassword("Gagan@123");
		return dSource;
	}
	@Bean
	public JdbcTemplate myjdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(mydataSource());
		return jdbcTemplate;
	}

}
