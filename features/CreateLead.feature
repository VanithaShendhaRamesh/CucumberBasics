Feature: Leaftaps CreateLead functionality 

#Background:
#Given Launch the chrome browser
#And Load the application url

Scenario: TC003_CreateLead credential
#Given Enter the username as 'Demosalesmanager'
#And Enter the password  as 'crmsfa'
Given Enter by ID on TextBox 'username' as 'Demosalesmanager'
Given Enter by ID on TextBox 'password' as 'crmsfa'
When Click by ClassName on 'decorativeSubmit' button
Then Homepage should be displayed
Then Wait for '5' Seconds
Given Click by LinkText on 'CRM/SFA' Link
Given Click by LinkText on 'Leads' Link
Given Click by LinkText on 'Create Lead' Link
Given Enter by ID on TextBox 'createLeadForm_companyName' as 'FIS'
Given Enter by ID on TextBox 'createLeadForm_firstName' as 'Vani'
Given Enter by ID on TextBox 'createLeadForm_lastName' as 'Shendha'
When Click by Name on 'submitButton' Button





