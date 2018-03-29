package util;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JobFileParser {
    public Jobs readConfigFile() {
        Gson gson = new Gson();
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("job.json");
        InputStreamReader reader = new InputStreamReader(resourceAsStream);
        return gson.fromJson(reader, Jobs.class);
    }
}
