# Microservice Setup
BISKOT API is the new micro service responsible for managing the cart of an e-commerce website.

## Your Mission should you choose to accept it, is to:

* Implement the endpoints defined in the swagger [biskot.yaml](contract/biskot.yaml), api model classes could be generated using openapi-generator-maven-plugin configured in pom.xml
* Setup the development best practices

## Cart business rules:

* Added quantity of a product should not exceed the stock availability
* Total price of the cart should not exceed 100 euros
* Cart cannot contain more than 3 different products

## Info
Carts should be persisted in memory using an embedded db or collection of you choice inside [InMemoryCartRepository](src/main/java/com/biskot/infra/repository/InMemoryCartRepository.java)

Biskot has a dependency with an external service allowing you to get products information. The call to this external service should be implemented in [ProductGateway](src/main/java/com/biskot/infra/gateway/ProductGateway.java)
A mock server is configured in [ProductMockServer](src/main/java/com/biskot/infra/mock/ProductMockServer.java) and products could be retrieved using this url : GET http://localhost:9001/products/{productId} (productId could take values from 1 to 4)

Biskot must be efficient and prod-ready

As always, should you finish the implementation, please push your work in the source code management of your choice and please, share it with us
