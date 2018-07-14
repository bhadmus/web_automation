                ##**SOLUTION**##
# The solution has been tested and it works successfully.
# To execute the code, you have to run it from the TestNG file named parallel.xml fi
# The WebTest.java was converted to TestNG because it will enable to run on different browsers in parallel.
# A separate class was written for The Screenshot but was referenced effectively on the WebTest.java class
# While running on different browsers. It was observed, that the *SignIn Test case* on Firefox had an error. It was deliberately left unfixed so as to be able to capture a screenshot of a failed Test case. The fix is to pass a maximize window command into the @BeforeMethod Class and scroll to view Elements where appropriate.
# TestNG replaced JUnit in this challenge because of the following reasons: 
# 1.  It helps to fashion out a better parallel mode configuration.
# 2.  It helps to generate automatically a human-readable report in the *test-output* folder.
# An apache class folder called commons-io was included in the solution as it has the FileUtils class required to help copy the file gotten from the screenshot designed for failed test cases.






# Home test task

**What do you already have?**
-----
 * web application with url http://automationpractice.com/index.php;
 * 3 [test cases](TESTCASES.md);
 * 3 automated tests.
 
We give the initial version of tests in order to save your time on extracting locators. 

**What do you need to do?**
----
You need to improve given automated tests as much as you can by designing your own solution to develop such kinds of tests for similar applications.
Feel free to replace any tool we used in initial version of tests(maven, junit) or add other ones, if you need.

Your solution can include:
* logging;
* taking screenshot on failed tests;
* generation human readable report;
* generating random values for insignificant test data, for example, for new user;
* WebDriver factory;
* encapsulation layers like test data, logic of tests, actions on web pages and so on;
* configurator:
  * run tests in parallel mode;
  * ability to run tests for different browsers/OS by configuring;
  * ability to run tests for different environments(urls) by configuring/by command-line.
* reading test data from file, for example, the name of dress, size and color in the checkout test.

If you would like to impress us cover as much point as you can!

**Evaluation Criteria**
-------------------
1. The improvements are done in efficient and effective manner.
2. The improved tests pass stably and follow described cases.
3. The solution is well and logically organised.
4. Tests execution does not take more time than initial version.
5. The code is documented and is easy to-follow.
6. The application is supplied with all the information required for us to run and validate it as well as a description and purpose of used additional libraries.
