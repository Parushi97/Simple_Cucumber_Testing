package com.cucumber.testing;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Using_Data_table_Step {
    @Given("^I have items:$")
    public void i_have_items(DataTable sample) {
        List<Map<String, String>> data = sample.asMaps(String.class, String.class);
        System.out.println("entered");
        for (Map<String, String> map : data) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

    }

    @When("^I buy$")
    public void i_buy(DataTable data2) throws Throwable {
        List<Map<String, String>> ds = data2.asMaps(String.class, String.class);
        System.out.println("inside when");
        for (Map<String, String> map : ds) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    @Then("^I should get$")
    public void i_should_get(DataTable dataTable) throws Throwable {
        List<List<String>> actualList= new ArrayList<List<String>>();
        actualList.add(Arrays.asList("item", "quant"));
        actualList.add(Arrays.asList("bottle", "1000"));

        DataTable actual = DataTable.create(actualList);
        dataTable.diff(actual);
        System.out.println("inside then"+dataTable);

    }

}
