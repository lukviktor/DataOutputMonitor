package com.abboott.getting_data;

import org.junit.jupiter.api.Test;

class GetDataFromWebsiteTest {

    @Test
    void parseDataFromSite() {
        System.out.println(new GetDataFromWebsite().parseDataFromSite());
    }

    @Test
    void searchElement() {
        System.out.println(new GetDataFromWebsite().searchElement());
    }
}