# test-kumparan
Simple Cucumber-based Selenium in Java

***Functionalities covered:***

_UI Positive Test Cases:_
1. Login using valid Facebook
2. Login using valid Google+
3. User can comment if logged in

_UI Negative test cases:_
1. Login using invalid Facebook
2. Login using invalid Google+
3. User can not comment if not logged in

***Prerequisite: Install maven & chromedriver***

1. This simple automation test project supports both Chrome and Firefox in parallel
2. `cd` to folder directory
3. Modify `TestSuite.xml` according to preferences
4. List of preferred cucumber folder to run can be edited on runner class(es)
5. Run `mvn clean test` from terminal to run the tests on test suite
