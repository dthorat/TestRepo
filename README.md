## Restaurant Search application

Take checkout of application from below github url,

	https://github.com/dthorat/TestRepo.git

To Download Dependencies run on root project

	gradlew eclipse dependencies

To run:

	./gradlew bootRun 

Create Restaurant endpoint

	Url : http://localhost:8080/restaurant-management/createRestaurant	
	Method : POST
	Content-Type : application/json
	Request Body : {
						 " name":"Kya Baat Hai",
						  "address.streetname":"Hadapsar-Nagar Bypass Road, Kharadi",
						  "address.pincode":"411018"
						}
						

Search Restaurant endpoint

	Url : http://localhost:8080/restaurant-management/searchRestaurant?pincode=123456
	Method : GET						