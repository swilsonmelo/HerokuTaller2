# HerokuTaller2

This web application allows you to calculate the mean and standard deviation of a set of data that is passed through a web page using Spark. The project implements my own implementation of a linked list this implementatios. This linked list is very similar to a Doubly LinkedList.

You can see the application working in heroku:
https://swilsonsparkweb.herokuapp.com

## Running locally

Compile first time the project after downloaded.

    mvn package

Make unit tests.

    mvn test

Change in src/main/resources/views/js/app.js the url because currently the url for the post is addressed to heroku.
Just change the comment.

   ![UrlPost](https://github.com/swilsonmelo/HerokuTaller2/blob/master/resources/imgs/postUrl.PNG)


To run the whole project.

    mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.designprimer.SparkWebApp
    
    To open in your browser: http://localhost:4567/index.html
    
To try it out, just add comma-separated numbers in the input and Calculate. They can be integers or real numbers.

   ![UrlPost](https://github.com/swilsonmelo/HerokuTaller2/blob/master/resources/imgs/use.PNG)

   The recorded numbers and the value of the mean and standard deviation will be added to the table

Generate documentation.

In order to obtain the documentation of the project, you must execute the command:

    mvn javadoc:jar

An HTML documentation will be generated in /target/site/apidocs/index.html.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management.
* [Spark](http://sparkjava.com/) - Micro Framework For Creating Web Applications

## Author

* **Willson Sneitder Melo Merchan** - Escuela Colombiana de Ingeniería Julio Garavito.

## License

* This project is under GNU General Public License - see [LICENSE](https://github.com/swilsonmelo/HerokuTaller2/blob/master/LICENSE) to more info.

