package geco;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PasswordGenerationTest {
    @Test
    public void getRandomPassword() throws Exception {
        PasswordGeneration pg = new PasswordGeneration();
        String pw = pg.getRandomPassword();
        assertThat(pw.length(), is(8));
    }

}