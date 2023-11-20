import modlingTheData.Login;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;



public class test1 {



    @Test
    public void t1() throws FileNotFoundException {

        ReadDataFromJson readDataFromJson =new ReadDataFromJson();


        System.out.println(readDataFromJson.readTestData().URL);

        System.out.println(readDataFromJson.readTestData().login.invalidCredentials.invalidPassword.password);
        System.out.println(readDataFromJson.readTestData().login.invalidCredentials.invalidPassword.username);

        System.out.println(readDataFromJson.readTestData().login.invalidCredentials.invalidUserName.username);
        System.out.println(readDataFromJson.readTestData().login.invalidCredentials.invalidUserName.password);


        System.out.println(readDataFromJson.readTestData().login.validCredentials.username);
        System.out.println(readDataFromJson.readTestData().login.validCredentials.password);

    }
}
