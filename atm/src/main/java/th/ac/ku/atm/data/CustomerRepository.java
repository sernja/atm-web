package th.ac.ku.atm.data;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import th.ac.ku.atm.model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerRepository {
    public List<Customer> findAll() {
        return null;
    }

    public Customer findById(int id) {
        return null;
    }

    public void save(Customer customer) { }

    public void deleteById(int id) { }
    class CustomerMapper implements RowMapper<Customer> {

        @Override
        public Customer mapRow(ResultSet resultSet, int i)
                throws SQLException {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String pin = resultSet.getString("pin");

            Customer customer = new Customer(id, name, pin);
            return customer;
        }
    }
}
