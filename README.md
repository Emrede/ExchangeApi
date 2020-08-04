## Documentation ##

The app is based on Spring Boot Restful API. H2 Database Engine used as memory DB. H2, JPA and Web dependencies included on Spring Initializr. IntelliJ IDEA used as IDE. The code structure designed on MVC pattern (separation of concerns).

1. Run the .jar file from:
	~\exchangeApi\target\exchange-0.0.1-SNAPSHOT.jar
	
2. 	To get an exchange rate between two currencies,
	GET http://localhost:8080/exchange?from=GBP&to=TRY
	
3. 	Calculate an amount of exchange rate with Conversion API,
	Example: 
	POST http://localhost:8080/convert?from=USD&to=GBP&amount=50
	
4.	List a transaction with its ID,
	Get by transaction ID:
	GET http://localhost:8080/conversion/1
	List of all conversions:
	GET http://localhost:8080/conversion-list

5. Used rates api for the data
	https://ratesapi.io/documentation/
	
6. Resource not found exception class included.

