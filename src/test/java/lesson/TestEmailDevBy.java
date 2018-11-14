package lesson;

import org.testng.annotations.DataProvider;

public class TestEmailDevBy {
    @DataProvider(name="user[email]")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"laiman2004gmail.com"},
                {" 2006@org"},
                {"#$%@mail.ru"},
                {"djncwwmcd@.com"},
                {" @mail.org"},
        };
    }
}
