import org.json.JSONObject;
import org.jsoup.*;
import org.jsoup.nodes.Document;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class API {
    public static void main(String[] args) throws IOException, InterruptedException {
        String u = "https://randstuff.ru/fact/";
        try {
            StringBuilder text = new StringBuilder();
            URL url = new URL(u);
            Scanner html = new Scanner(new BufferedReader(new InputStreamReader(url.openStream())));
            while (html.hasNext()) {
                text.append(html.nextLine());
            }
            Document webpage = Jsoup.parse(text.toString());
            System.out.println(webpage.getElementById("fact").select("td").text());
        } catch (Exception e) {
        }
    }
}
