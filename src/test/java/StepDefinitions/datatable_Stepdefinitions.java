package StepDefinitions;

import java.util.List;
import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.String;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class datatable_Stepdefinitions {
	@Given("send below values to a function as datatable")
	public void datatable1(DataTable dataTable)

	{
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> map : list) {
			String s1 = map.get("Field");
			String s2 = map.get("value");
			System.out.println(s1);
			System.out.println(s2);
		}
	}

}
