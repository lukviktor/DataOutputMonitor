package com.abboott.parsing_data;

import com.abboott.data.DataProgram;
import com.abboott.getting_data.GetDataFromWebsite;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class DataArrayWriter {

    // Считывание данных с веб-сайта и отсеивание пустых строк
    public void readDataFromWebsite(List<String> list) {
        GetDataFromWebsite getDataFromWebsite = new GetDataFromWebsite();
        Document document = getDataFromWebsite.parseDataFromSite();
        if (document != null) {
            Elements elements = document
                    .select(DataProgram.CSS_SELECTOR);
            elements.stream()
                    .map(Element::text)
                    .filter(text -> !text.isEmpty()).forEach(list::add);
        }
    }


    public List<String> dataArray() {
        DataArrayWriter dataArrayWriter = new DataArrayWriter();
        List<String> websiteData = new ArrayList<>();
        dataArrayWriter.readDataFromWebsite(websiteData);
        return websiteData;
    }
}
