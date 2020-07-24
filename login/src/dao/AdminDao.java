package dao;

import main.Admin;
import org.junit.jupiter.engine.execution.BeforeEachMethodAdapter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class AdminDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
    public Admin login(Admin loginAdmin){
        String sql = "select * from user where username = ? and password = ?";

        Admin admin = template.queryForObject(sql,
                new BeanPropertyRowMapper<Admin>(Admin.class),
                loginAdmin.getName(),loginAdmin.getPassword());
        return admin;
    }
}
