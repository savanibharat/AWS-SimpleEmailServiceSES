AWS-SimpleEmailServiceSES
=========================
This repository contains code to sent Emails from my email id to any other emaild (regardless of any email service provider like gmail, yahoo, rediff, etc).

Developers having the AWS account cannot send Emails to unverified emails directly.

Two ways to send emails through AWS SES

1)Sending to verified email id's 
----------Go to SERVICE SES.
----------The on left hand side click on Email Addresses
----------The click on button Verify a new Email Address
----------Enter an Email address that you want to verify
----------Click on verify email address button
----------Now log into the email address that was to be verified and check for AWS mail

  You have successfully verified your email
  
  Though this approach may seem useless but it is pretty useful for not getting spams
  
2)Sending emails to unverified email
----------For this you need to register a case(online request) with amazon giving them valid reason to send email's.

Documentations
http://aws.amazon.com/documentation/ses/
http://aws.amazon.com/documentation/sns/
