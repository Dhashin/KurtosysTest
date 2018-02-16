# KurtosysTest
This Repo is submit all code and answers for the Kurtosys test taken by Dhashin Moodley.

This test consists of 2 parts

GUI Test

- The Gui test was delevoped in java-selenium using eclipse.
- The lastest selnium was used with Java 8 and developed on windows 10
- It contains 2 files : the object map and the first test which is the main method.
- for you to run this test you need to import the project into your eclipse workspace and reimport the selenium libraries which are included in the repo
- you also need to update the path to the chromedriver (also included in repo) within the actual test
- I did not complete the last step of the test which is to verify that the graphs are present


API Test

- I used postman and Jmeter for the API Test
- Jmeter 4 was used on Windows 10
- I did not complete the API test
- I only managed to assert the 200 response code
- How I would proceed to complete the api test would be to either :
	- have a regular expression extractor to extract the JSON varaible i want followed by a bean shell sampler to assert them
	- or to have to JSON extractor currently in and the correct json expression to extract values and assert them