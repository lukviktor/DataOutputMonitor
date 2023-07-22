package com.abboott;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParseDocument {
    public Document downloadContentDocument(String urlDoc) {

        Document document = null;
        try {
            document = Jsoup.connect(urlDoc).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return document;

    }

    public Document downloadContentFileHTMLDocument(String pathToFile) {
        var htmlFile = new File(pathToFile);
        Document document = null;
        try {
            document = Jsoup.parse(htmlFile, StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return document;
    }

}
