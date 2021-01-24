Feature: Leaftaps EditLead functionality 


Scenario: TC004_EditLead credential
Given Enter by ID on TextBox 'username' as 'Demosalesmanager'
Given Enter by ID on TextBox 'password' as 'crmsfa'
When Click by ClassName on 'decorativeSubmit' button
Then Homepage should be displayed
Then Wait for '5' Seconds
Given Click by LinkText on 'CRM/SFA' Link
Given Click by LinkText on 'Leads' Link
Given Click by LinkText on 'Find Leads' Link
Given Click by Xpath on '//span[text()="Phone"]'
Given Enter by Xpath on TextBox '//input[@name="phoneNumber"]' as '99'
Given Click by Xpath on '/button[text()="Find Leads"]'
Given Click by Xpath on '//div[@class="x-grid3-cell-inner x-grid3-col-partyId"]/a'
Given Click by LinkText on 'Edit' Link
Given Enter by ID on TextBox 'updateLeadForm_companyName' as 'TCS'
When Click by Name on 'submitButton' Button





