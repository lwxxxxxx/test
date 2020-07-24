package test;
import dao.AdminDao;
import main.Admin;
import org.testng.annotations.Test;

public class AdminDaoTest {
    @Test
    public  void testLogin(){
        Admin loginadmin = new Admin();
        loginadmin.setName("dingding");
        loginadmin.setPassword("123456");

        AdminDao dao = new AdminDao();
        Admin admin = dao.login(loginadmin);
        System.out.println(admin);
    }

}
