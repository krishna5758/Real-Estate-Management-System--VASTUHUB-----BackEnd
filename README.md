Vastuhub - Real Estate Management System (Backend)


Vastuhub is a comprehensive real estate management system designed to facilitate seamless property transactions, including posting properties, managing favorites, and exploring real estate listings. This repository contains the backend service developed using Spring Boot.

Features
User Management:

Registration and login functionality with role-based access (admin, buyer, seller, agent).
Secure user authentication and email verification.
Property Management:

Property listings with details such as type (rent/sell), location, price, and more.
Sellers can post and manage properties, including uploading multiple images.
Favorites and Wishlist:

Buyers can explore and like properties.
Liked properties are stored in the "Favourites" section of the buyer's profile.
Notifications are sent to the seller when a buyer is interested in a property.
Email Notifications:

Sellers are notified via email when a buyer likes their property, with the buyer’s details included.
Technologies Used
Java 17
Spring Boot 3.x
Spring Data JPA
Spring Security (JWT-based authentication)
Spring Mail
H2/MySQL as the database
Postman for API testing
Maven for dependency management
