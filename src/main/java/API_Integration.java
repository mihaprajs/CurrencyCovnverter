import org.json.*;
import okhttp3.*;
import java.io.IOException;

public class API_Integration {
    public static double Convert(String currency1, String currency2, double value) throws IOException {
        String url_str = "API_URL" + currency1.toUpperCase();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url_str)
                .get()
                .build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        String stringResponse = response.body().string();
        JSONObject jsonObject = new JSONObject(stringResponse);
        JSONObject ratesObject = jsonObject.getJSONObject("conversion_rates");
        double rate = ratesObject.getDouble(currency2.toUpperCase());
        return rate*value;
    }
}
