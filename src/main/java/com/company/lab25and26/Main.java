package com.company.lab25and26;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines")
                .proxy( "188.170.233.100", 3128)
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").get();
        Elements lines = doc.select("span");
        Elements stations = doc.select("[data-line]");

        for (Element line : stations) {
            System.out.println(line.text());
        }

    }
}
