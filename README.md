# offerService

This is RESTful service to create, get, get all and update offers.
Assumptions:
1. Items by weight are not considered. Only items by quantity are accpeted in this service
2. Automatic expiration of offer is not developed. Idea is to run a scheduling job everynight and look for offers whose validTill date is less than current date and then set its expired flag to true
3. This code can be further optimised if some more time can be spent on it. 
