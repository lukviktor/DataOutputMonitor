package com.abboott;

public class Main {
    public static void main(String[] args) {
        ParseDocument pd = new ParseDocument();
        System.out.println(pd.downloadContentDocument());
ElementsAndAttributes ea = new ElementsAndAttributes();
        System.out.println(ea.gettingHyperlinksOnPage());
    }
}