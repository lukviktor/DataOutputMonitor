package com.abboott.getting_data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetDataFromWebsiteTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void parseDataFromSite() {
        GetDataFromWebsite getDataFromWebsite = new GetDataFromWebsite();
        System.out.println(getDataFromWebsite.parseDataFromSite());
    }

    @Test
    void searchElement() {
        GetDataFromWebsite getDataFromWebsite = new GetDataFromWebsite();
        System.out.println(getDataFromWebsite.searchElement());
    }
}