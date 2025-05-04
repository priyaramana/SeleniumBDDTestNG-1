Feature: ContactUs page

Scenario Outline: Contact us page validation
Given user is on contact us page
When user enter <Name>,<Email>,<Subject>,<Message>
And click on contact us CTA
And click ok on the alert
Then User should see success message "Success! Your details have been submitted successfully."

|Name|Email|Subject|Message|
|test|test@123.com|testSubject|testMessage|