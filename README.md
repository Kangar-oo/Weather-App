
# Weather App 🌦️

This is a simple Java Swing application that fetches and displays the current temperature and humidity of any city using the OpenWeatherMap API.

---

## Features ✨

- Search for any city worldwide 🌍
- See the current temperature (°C) and humidity (%) 📈
- Simple and clean graphical interface using **Swing** 🎨

---

## Requirements ⚙️

- Java JDK 8 or higher
- Internet connection
- OpenWeatherMap API key
- External library: [`json-20240303.jar`](https://repo1.maven.org/maven2/org/json/json/20240303/json-20240303.jar)

---

## Setup Instructions 🚀

1. **Clone or download this repository**.

2. **Download** the `json-20240303.jar` library from [here](https://repo1.maven.org/maven2/org/json/json/20240303/json-20240303.jar).

3. **Place** the `json-20240303.jar` file in the same directory as `Weatherapp.java`.

4. **Compile the program**:

   On **Windows**:

   ```bash
   javac -cp ".;json-20240303.jar" Weatherapp.java
   ```

   On **Mac/Linux**:

   ```bash
   javac -cp ".:json-20240303.jar" Weatherapp.java
   ```

5. **Run the program**:

   On **Windows**:

   ```bash
   java -cp ".;json-20240303.jar" Weatherapp
   ```

   On **Mac/Linux**:

   ```bash
   java -cp ".:json-20240303.jar" Weatherapp
   ```

---

## Configuration ⚡

Make sure you replace the `API_KEY` in `Weatherapp.java` with your own OpenWeatherMap API key if needed:

```java
private final String API_KEY = "your_api_key_here";
```

You can get your free API key from [https://openweathermap.org/api](https://openweathermap.org/api).

---

## Possible Problems and Solutions ❗

| Problem                                                 | Reason                                                 | Solution                                                                               |
| ------------------------------------------------------- | ------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| `java.lang.ClassNotFoundException: org.json.JSONObject` | You didn't include the `json-20240303.jar` library.    | Make sure you downloaded the `.jar` file and added it to the classpath.                |
| `Error: city not found`                                 | You entered a wrong or misspelled city name.           | Check the spelling of the city you entered.                                            |
| No Internet Connection                                  | The app needs to connect to the OpenWeatherMap server. | Make sure your PC has internet access while using the app.                             |
| `Invalid API key`                                       | API key is wrong or expired.                           | Get a new API key from OpenWeatherMap and update it in the code.                       |
| Problems with classpath (`-cp`)                         | Command format is wrong.                               | Use `;` (semicolon) on Windows and `:` (colon) on Mac/Linux between classpath entries. |

---

## Screenshots 📸



---![Screenshot (64)](https://github.com/user-attachments/assets/b80769e4-e195-462a-9112-e369e50c67dc)


## License 📄

This project is licensed under the [MIT License](LICENSE).


---

## Author 👨‍💻

- Developed by Kangar-oo 
- Inspired by learning Java and building real-world applications!

