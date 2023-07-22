package com.abboott;

public class Main {
    public static void main(String[] args) {
        String URLS = "https://devmark.ru/";
        ParseDocument pd = new ParseDocument();
        System.out.println(pd.downloadContentDocument(URLS));
    }
}