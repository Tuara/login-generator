package geco;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        loginService.addLogin(loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
        assertThat(loginService.loginExists("JRAL2"), is(true));
    }

}