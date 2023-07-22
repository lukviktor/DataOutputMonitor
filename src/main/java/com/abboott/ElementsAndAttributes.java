package com.abboott;

import org.jsoup.select.Elements;

public class ElementsAndAttributes {

    ElementsAndAttributes attributes = new ElementsAndAttributes();

    protected Elements gettingHyperlinksOnPage() {
        ParseDocument pd = new ParseDocument();
        return pd.downloadContentDocument().body().select("a");
    }
}
