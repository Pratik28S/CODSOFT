import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;

public class currconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HttpClient httpClient = HttpClients.createDefault();

        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        HttpGet httpGet = new HttpGet("https://openexchangerates.org/api/latest.json?app_id=fee72adba4024ca1bfec0473a925153b&base=" + baseCurrency);

        try {
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String json = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(json);

                if (jsonObject.has("rates")) {
                    JSONObject rates = jsonObject.getJSONObject("rates");

                    double amountToConvert;

                    System.out.print("Enter the amount in " + baseCurrency + ": ");
                    amountToConvert = scanner.nextDouble();

                    double exchangeRate = rates.getDouble(targetCurrency);
                    double convertedAmount = amountToConvert * exchangeRate;

                    System.out.printf("%.2f %s = %.2f %s%n", amountToConvert, baseCurrency, convertedAmount, targetCurrency);
                } else {
                    System.out.println("The 'rates' field was not found in the JSON response.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
