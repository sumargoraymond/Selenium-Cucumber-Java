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
2. Modify `TestSuite.xml` according to preferences
3. List of preferred cucumber folder to run can be edited on runner class(es) E.g. `RunnerLoginFeatures.java`
5. On terminal `cd` to folder directory and run `mvn clean test` to run the tests on test suite
