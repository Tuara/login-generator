package geco;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService test = new LoginService(new String[]{"Test", "Ok"});

    @Test
    public void testLoginExists() throws Exception {
        assertThat(test.loginExists("Test"), is(true));
    }

    @Test
    public void addLogin() throws Exception {
        test.addLogin("Ajout");
        assertThat(test.loginExists("Ajout"), is(true));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        List<String> logins = test.findAllLoginsStartingWith("T");
        assertThat(logins.get(0), is("Test"));
    }

    @Test
    public void findAllLogins() throws Exception {
        List<String> logins = test.findAllLogins();
        assertThat(logins.contains("Test"), is(true));
    }

}