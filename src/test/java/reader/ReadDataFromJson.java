package reader;

import com.google.gson.Gson;
import modlingTheData.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromJson {

    public DataModel readTestData() throws FileNotFoundException {

        FileReader fileReader = new FileReader("data/testData.json");
        DataModel dataModel = new Gson().fromJson(fileReader, DataModel.class);

        return dataModel ;


    }
}
