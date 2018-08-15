## Spring boot app with Angular 5 client embedded [![Build Status]

## Table of contents

   * [Description](#description)
      * [Functional informations](#functional-informations)
      * [Prerequisites](#prerequisites)
      * [Live](#live)
      * [Build and run](#build-and-run)
      * [Rest Api integration with h2 and mongo db](#rest-api-integration-with-h2-and-mongo-db)
		* [Rest Api JSON request exposed](#rest-api-json-request-exposed)
		* [Call Rest Api JSON request with spring boot swagger ui](#call-rest-api-json-request-with-spring-boot-swagger-ui)
		* [UI api call](#ui-api-call)
      	* [Using Dev Mode](#using-dev-mode)
   * [Deploy jar on heroku from your machine](#deploy-jar-on-heroku-from-your-machine)
   * [Automatic build and deploy with travis](#automatic-build-and-deploy-with-travis)
   * [Live demo heroku deployed jar](#live-demo-heroku-deployed-jar)

### Prerequisites

* Install the angular-cli with command :

```
npm install -g @angular/cli@1.7.4
```

And generate an angular project with :

```
ng new <frontend-folder-name>
```


* Add npm build.prod script in your **<frontend-folder-name> package.json project** with @angular/cli devDependency as:

```
{
  "name": "angular-dashboard-full-stack",
  "version": "1.1.0",
  "license": "MIT",
  "author": "mirkourru",
  "scripts": {
    "ng": "ng",
    "start": "ng serve",
    "build": "ng build",
    "build.prod": "ng build --prod",
    "test": "ng test",
    "lint": "ng lint",
    "e2e": "ng e2e"
  },
  "private": true,
  "dependencies": {
    ....
  },
  "devDependencies"{
    "@angular/cli": "1.7.4"
  }
}
```

* JDK 8 (set JAVA_HOME environment variable)

* The Node.js version compatible with your angular app

* MAVEN (to use **mvn** command else use in windows ./mvnw.cmd or in linux ./mvnw instead)

* IDE ( i.e. Eclipse for java and visual studio code for typescript/angular projects)

### Live

Execute in the main folder of this repo, if you have already built the frontend and there is the generated code in **frontend-app/dist** :

```
mvn clean spring-boot:run
```
else:

```
mvn clean spring-boot:run -Pbuild-ui
```

Open browser on localhost:8081:

![Live-App](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/live-app.jpg)

### Build and run

If you have already built the frontend (i. e. after develop on visual studio code) and you have the generated code of the _ng build_ in **frontend-app/dist**, execute in the main folder of this repo:

```
mvn clean package
```

If you want to build also the frontend, run:

```
mvn clean package -Pbuild-ui
```

After all cases run:

```
java -jar target/*.jar
```

Open browser on localhost:8081


### Rest Api integration with h2 and mongo db

You can use, according various spring profiles, an h2 embedded db, an mongodb embedded or for production.
The application exposes some rest api (**UserControllor and TimeController**) that connects to db (default application properties, h2 and mongop).

Run your application with:
* _-Dspring.profiles.active=mongo_ to use embedded mongo db (it is activated for default).
* _-Dspring.profiles.active=mongop_ to use mongo db for prod.
* _-Dspring.profiles.active=h2_ to use h2 embedded. The console is enabled with _/h2_ endpoint.


#### Rest Api JSON request exposed

There are some REST services exposed for two entities: **Time and User** that use a different db according your spring runtime profile (h2, mongo and mongop).

Every entity is a interface that maps a specific typology db table.

The fields of these entities are:

```
Time = {
String id,
String value
};

User= {
String id,
String username,
String email,
String firstname,
String lastname
}

```

For the _time entity_ you can call using these endpoints:

* _api/times_ : **Get Request** that returns all time entities created (empty object if nothing exists)
* _api/times/{id}_ : **Get Request** that creates a time entity with your specified id. The value field is set with the your current time. 
* _api/times/find/{id}_ : **Get Request** that returns a time entity with the specified id (empty object if not exists)

**:warning:**
> If you create a time with an already existing id, it will be executed an update because the id is the mandatory primary key.

For example if you want to create a time entity with _id equal to 1_, on browser:

![Create-Time](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/create-time.jpg)

And after to view all times created:

![List-Times](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/list-times.jpg)

Instead, for the _user entity_ you can call using these endpoints:

* _api/users_ : **Get Request** that returns all users entities created (empty object if nothing exists)
* _api/users_ : **Post Request** that creates a user with a request mapping its fields. On success it returns the id.
* _api/users/{id}_ : **Get Request** that returns an user entity with the specified id (empty if not exists)
* _api/users/{id}_ : **Delete Request** that deletes an user entity with the specified id. On success it returns the id .
* _api/users/{id}_ : **Put Request** that updates the user with a specified id according your request fields. On success it returns the user object updated.

**:warning:**
> If you create an user with an already existing id, it will be executed an update because the id is the mandatory primary key.



#### Call Rest Api JSON request with spring boot swagger ui

You can use _Swagger UI_ app to call your REST API accessing to **/swagger-ui.html endpoint**. An example to call the post _api/users_ :

![Swagger-UI](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/swagger-ui-create.gif)


#### UI api call 

You can create and update an user on the _user profile dashboard_. After successfull creation or update, you are redirected to the _user list dashboard_ where are listed all users. On this you can delete and view a user.

So **all user entity api** are called by the UI .

So as example.

Insert all data for required fields (email not mandatory) to enable **CREATE USER** button and click on:

![List-Times](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/create-ui.jpg)

After creation you will be redirect on the page where are **listed all created users**:

![List-User-Ui](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/list-user-ui.jpg)

You can delete or update an user. If you click on edit button (pencil icon), you will be send on the **User Profile page to update**:

![Update-User-Ui](https://github.com/amanganiello90/java-angular-web-app/raw/branch-screen/update-user-ui.jpg)

Now the id is blocked, and you can modify all fields. After click on the **UPDATE USER** button in order to perform action, and you will review the changing on the **User List page**.


#### Using Dev Mode

You can use the live reload for spring boot when you use the spring-boot-plugin.

Run:

```
mvn clean spring-boot:run -Pdev
```

#### Write automatic integration api tests with rest assured and cucumber

You can write integration api tests with rest assured in [java cucumber](https://examples.javacodegeeks.com/core-java/junit/junit-cucumber-example/). In the JUnit test spring-boot is automatically run and performed your @Test.
See the **Test.java** and **Steps.java** examples in _src/test/java/**_ path.
The test is a normal JUnit test run also by the surefire maven plugin and maven test phase.


## Deploy jar on heroku from your machine


Create an account on [keroku](https://www.heroku.com/) .

After install the __heroku-cli__

```
npm install -g heroku
```

Then:

```
heroku plugins:install heroku-cli-deploy

heroku create mirko-nano-app2  --no-remote

```

To deploy the jar file, execute in the main folder of this repo:

```
heroku deploy:jar target/app.jar --app spring-boot-angular-app2
```

View [app](https://spring-boot-angular-app2.herokuapp.com/)

## Automatic build and deploy with travis

You can configure your git repo for continuous integration with [travis](https://travis-ci.org/) .

For the configuration travis will use the **.travis.yml** and **.travis-deploy-heroku.sh** files.

Then, for your repo you have to configure only two things:

* Replace your heroku deploy app name in the **.travis-deploy-heroku.sh** (here *spring-boot-angular-app* with *spring-boot-angular-app2*) that before you have created on heroku with the command (or heroku dashboard):

```
heroku create spring-boot-angular-app2  --no-remote

```

* Set the HEROKU_API_KEY environment variable on travis. You can retrieve it after these commands on your machine:

```
heroku login
heroku auth:token

```
The last display the token that you will set in the HEROKU_API_KEY variable. 
It allows travis to have permission to deploy on heroku.

## Live demo heroku deployed jar

A demo with default mongo embedded db [app](https://spring-boot-angular-app.herokuapp.com/)

