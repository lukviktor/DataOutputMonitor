package com.abboott;

import org.jsoup.select.Elements;

public class ElementsAndAttributes {

    ElementsAndAttributes attributes = new ElementsAndAttributes();
protected Elements gettingHyperlinksOnPage(){
    ParseDocument pd = new ParseDocument();
    var anchors = pd.downloadContentDocument().body().select("a");
    return anchors;
}


    public static void main(String[] args) {
        ElementsAndAttributes attributes = new ElementsAndAttributes();
        System.out.println(attributes.gettingHyperlinksOnPage());
    }
}
