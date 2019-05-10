package itc.com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import itc.com.model.Customer;

@Repository
public class CustomerJDBCRepository  {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public Customer findById(long id) {
		return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Customer>(Customer.class));
	}
}
