package com.company.lab23and24;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    private static final String SAMPLE_CSV_FILE_PATH = "src/main/java/com/company/lab23and24/movementList.csv";

    public static void main(String[] args) throws IOException {
        csvParser();
        parseMirea();
    }

    public static void csvParser()  {

        float avgPrihod = 0;
        float avgRashod = 0;
        HashMap<String, Float> result = new HashMap<>();

        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH), Charset.forName("Windows-1251"));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord = csvReader.readNext();
            while ((nextRecord = csvReader.readNext()) != null) {
                String nameCompany = Arrays.stream(nextRecord[5].replaceAll("[\\s]{2,}", " ").split(" ")).reduce("", (a, b) -> a + " " + b);
                avgPrihod += Float.parseFloat(nextRecord[6].replace(',', '.'));
                avgRashod += Float.parseFloat(nextRecord[7].replace(',', '.'));

                if(result.containsKey(nameCompany)){
                    result.put(nameCompany, result.get(nameCompany) + Float.parseFloat(nextRecord[7].replace(',', '.')));
                }else{
                    result.put(nameCompany, Float.parseFloat(nextRecord[7].replace(',', '.')));
                }

                System.out.println("Company: " + nameCompany);
                System.out.println("Приход : " + nextRecord[6]);
                System.out.println("Расход : " + nextRecord[7]);
                System.out.println("==========================");
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        System.out.println("Общий приход: "+ avgPrihod );
        System.out.println("Общий расход: "+ avgRashod );
        System.out.println("Суммы расходов по организациям:");
        for(Map.Entry<String, Float> entry : result.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void parseMirea() throws IOException {
        Document doc = Jsoup.connect("https://www.mirea.ru/")
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").get();
        Elements imgs = doc.select("img");
        List<String> stringList = new ArrayList<>();
        for (Element img : imgs) {
            stringList.add(img.absUrl("src"));
        }
        for(String path: stringList){
            try{
                Connection.Response resultImageResponse = Jsoup.connect(path).ignoreContentType(true).execute();
                String[] nameArray = path.split("/");
                System.out.println(nameArray[nameArray.length-1]);
                FileOutputStream out = (new FileOutputStream(new java.io.File("src/main/java/com/company/lab23and24/images/" + nameArray[nameArray.length-1])));
                out.write(resultImageResponse.bodyAsBytes());
                out.close();
            }catch (IllegalArgumentException | FileNotFoundException ex){
                System.out.println("Ошибка данных" + path);
            }
        }
    }
}
