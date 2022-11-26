Feature: create account for automation practice


Scenario: Login to the banking website and deposit cash in your account[positive testcase]
     Given Launch the url and Navigate to login Page
	Then Enter valid username
	 And Enter the deposit button
	 And Enter the deposit amount
	 And click the deposit button
	 Then click logout button
 
Scenario: Login to the banking website and deposit cash in your account[Negative testcase]
     Given Launch the url and Navigate to login Page
	Then Enter invalid username
	 And Enter the deposit button
	 And Enter the deposit amount
	 And click the deposit button
	 Then click logout button