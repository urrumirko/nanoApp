## Nano Application Code test Mirko Urru

### Prerequisites

* Install the angular-cli with command :

```
npm install -g @angular/cli@1.7.4
```

* JDK 8 (set JAVA_HOME environment variable)

* The Node.js version compatible with your angular app

* MAVEN (to use **mvn** command else use in windows ./mvnw.cmd or in linux ./mvnw instead)

* IDE ( i.e. Eclipse for java and visual studio code for typescript/angular projects)

### Live

Execute in the main folder of this repo:

```
mvn clean spring-boot:run -Pbuild-ui
```

Open browser on localhost:8080:


<<<<<<< HEAD
=======


>>>>>>> 0dd28356bab7110f0b98ceed769386861248ae4f
### Build the Jar

If you want to build a single jar to be executed standalone:

```
mvn clean package -Pbuild-ui
```

After all cases run:

```
java -jar target/*.jar
```

Open browser on localhost:8080


### Rest Api integration with h2

The application exposes a rest api (**CampaignController) that connects to db.

#### Rest Api JSON request exposed

For the _campaign entity_ you can call using these endpoints:

* _campaign/all_ : **Get Request** that returns all campaign entities created (empty object if nothing exists)
* _campaign/{id}_ : **Get Request** that rturn a campaign entity with your specified id.

#### Call Rest Api JSON request with spring boot swagger ui

You can use _Swagger UI_ app to call your REST API accessing to **/swagger-ui.html endpoint**. An example to call the post _api/users_ :

#### Using Dev Mode

You can use the live reload for spring boot when you use the spring-boot-plugin.

Run:

```
mvn clean spring-boot:run -Pdev
```

## Deploy jar on heroku from your machine


Create an account on [keroku](https://www.heroku.com/) .

After install the __heroku-cli__

```
npm install -g heroku
```

Then:

```
heroku plugins:install heroku-cli-deploy

heroku create nanoapps  --no-remote

```

To deploy the jar file, execute in the main folder of this repo:

```
heroku deploy:jar target/app.jar --app nanoapps
```

View [app](https://nanoapps.herokuapp.com/)

## Automatic build and deploy with travis

Git repo configured for continuous integration with [travis](https://travis-ci.org/) .

For the configuration travis I used the **.travis.yml** and **.travis-deploy-heroku.sh** files.
