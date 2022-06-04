# RevatureProject1
Revature Project 1 Shopping App

Project Description:
Set up the backend for an online store to buy items. Users can register and log in to add items to their cart. Then they can place orders.
Registered users are stored in the Users table.
Items that users can buy are stored in the Items table.
User's carts are stored in the Cart table.
Users orders are stored in the Orders table.

Required Features:
Register - register new users,
Login/Logout - login and logout users,
Get Users - get all users and their cart,
Get Items - gets all items that are available in store,
Add Item to Cart - adds selected item to the cart,

My Additional Features:
Add Items - Adds items to database,
Get a Single User - Get a single user and their cart,
Place Order - Transfer cart items to order, Add order to orders table, Empty Cart, Decrease item stock,
Validate Email - Check if email is valid,
Authentication Exceptions - Throw custom exceptions for invalid login, actions performed when not logged in,
Get a Single Item,
Update and Delete Users/Items

Technologies:
Java
Spring
REST
PostgreSQL
Postman
DBeaver
AWS

How To Run:
Assumption - AWS services are running. In Postman perform the following:

Get All Items: GET ec2:8080/items

Get a Single Item: GET ec2:8080/{itemId}

Delete an Item: DELETE ec2:8080/{itemId}

Update an Item: PUT ec2:8080/{itemId}
Request Body Raw JSON:
{
  "itemName": "youritemname",
  "qoh": "yourquantityonhand",
  "price": "yourprice"
}

Add an Item: POST ec2:8080/items
Request Body Raw JSON:
{
  "itemName": "youritemname",
  "qoh": "yourquantityonhand",
  "price": "yourprice"
}

Get All Users: GET ec2:8080/users

Get a Single User: GET ec2:8080/{userId}

Delete a User: DELETE ec2:8080/{userId}

Update a User: PUT ec2:8080/{userId}
Request Body Raw JSON:
{
  "email": "youremail",
  "password": "yourpassword"
}

Register a User: POST ec2:8080/regsiter
Request Body Raw JSON:
{
  "email": "youremail",
  "password": "yourpassword"
}

Login a User: GET ec2:8080/login
Request Body Raw JSON:
{
  "email": "youremail",
  "password": "yourpassword"
}

Logout a User: GET ec2:8080/logout

Add an Item to Cart: POST ec2:8080/additemtocart/{itemId}

Place Order: POST ec2:8080/placeorder
Request Body Raw JSON:
{
  "address": "youraddress",
  "city": "yourcity",
  "state": "yourstate",
  "zip": "yourzip"
}

Actuator Metrics: GET ec2:8080/actuator
