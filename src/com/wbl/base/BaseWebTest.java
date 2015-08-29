package com.wbl.base;

import com.wbl.utils.PageDriver;
import com.wbl.utils.WBy;
import org.testng.annotations.*;


public abstract class BaseWebTest extends BaseTest {

    public PageDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new PageDriver(_config);
        WBy.loadJsonMap(String.format("%s/locators.json", System.getProperty("user.dir")));
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

}