package com.abboott;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParseDocument {
    protected Document downloadContentDocument() {

        Document document = null;
        try {
            document = Jsoup.connect(DataContent.URLS).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return document;

    }

    protected Document downloadContentFileHTMLDocument(String pathToFile) {
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
