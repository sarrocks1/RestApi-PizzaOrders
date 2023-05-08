# RestApi-PizzaOrders
SpringBoot App demonstrating various REST APIs using a simple Pizza-Order Entity.  

Pull the image directly from docker-hub:
```
$> docker pull sarrocksdev/pizzarestapi
```

To Build Image from scratch :
```
$> mvn clean package
$> docker build -t appname:tagname .
```
To Run The Image :
```
$> docker run -d -p 8080:8888 appname:tagname
```
This will run the Container on port 8080 of localhost.
By default , Port 8888 is exposed.

Testing PR
