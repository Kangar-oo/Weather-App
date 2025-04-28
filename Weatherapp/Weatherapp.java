import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import org.json.JSONObject;

public class Weatherapp extends JFrame {
    private JTextField cityField;
    private JButton fetchButton;
    private JTextArea resultArea;
    private final String API_KEY = "876821249348a793ec9d6351ebe80529";

    public Weatherapp() {
        setTitle("Weather app");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        cityField = new JTextField(20);
        fetchButton = new JButton("Get Weather");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        add(new JLabel("Enter City:"));
        add(cityField);
        add(fetchButton);
        add(new JScrollPane(resultArea));

        fetchButton.addActionListener(e -> getweather());

        setVisible(true);
    }

    private void getweather() {
        String city = cityField.getText().trim();
        String urlstring = String.format(
            "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric",
            city, API_KEY);

        try {
            URL url = new URL(urlstring);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject json = new JSONObject(response.toString());
            if (json.getInt("cod") == 200) {
                JSONObject main = json.getJSONObject("main");
                double temp = main.getDouble("temp");
                int humidity = main.getInt("humidity");

                String weather = String.format("Temp: %.1f°C\nHumidity: %d%%", temp, humidity);
                resultArea.setText(weather);
            } else {
                String message = json.optString("message", "Unknown error");
                resultArea.setText("Error: " + message);
            }

        } catch (Exception ex) {
            resultArea.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Weatherapp::new);
    }
}
