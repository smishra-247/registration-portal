<h1 align="center">  A Student Registration Portal </h1>

<p align="center"> I created this as a part of my project in college </p>

------

## Technologies used in this project
    
- HTML, CSS, Java Script (Frontend)
- Spring Boot (Backend)
- Mysql  Server (Database)

------

## Requirements

- Java 17
- An active internet connection

------

## Deploying

### On your Linux Machine use the following commands

```sh
sudo apt update -y && sudo apt install openjdk-17-jdk openjdk-17-jre git -y
```

```sh
git clone https://github.com/smishra-247/registration-portal.git
```

```sh
cd registration-portal
```

Now you will need to fill some neccesarry details in this file

`src/main/resources/application.properties`

here you need to the replace `database` with your actual database name, and same for the `username` and the `password`

Create a table in your sql-server database

```sql
CREATE TABLE Student(id int AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), course VARCHAR(15), rollNo int);
```

After that run this command on your terminal and wait for some time this will install all the required dependencies for the application to run
```sh
./mvnw package
```

After completing that you will need to run the command below to start the application. Make sure that your mysql server is up and running else you will get an error on your terminal

Don't know how to setup mysql server? [Click here](https://github.com/smishra-247)

```sh
java -jar target/app-1.0.jar
```

------

## About the Project 
<pre>
Submission Date   : 18-jan-2024
Submitted By      : Saurabh Mishra
Submitted To      : Mr. Aalekh Choudhary,
                    Assistant Professor,
                    Department of Computer Applications,
                    SRMIST Delhi NCR
</pre> 