# HerokuTaller2
You can see the application working in heroku:
https://swilsonsparkweb.herokuapp.com
## Running locally

Compile first time the project after downloaded.

    mvn package

Make unit tests.

    mvn test

Change in src/main/resources/views/js/app.js the url because currently the url for the post is addressed to heroku.

To run the whole project.

    mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.designprimer.SparkWebApp
    
    To open in your browser: http://localhost:4567/index.html
    

Generate documentation.

In order to obtain the documentation of the project, you must execute the command:

    mvn javadoc:jar

An HTML documentation will be generated in /target/site/apidocs/index.html.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management.

## Author

* **Willson Sneitder Melo Merchan** - Escuela Colombiana de Ingeniería Julio Garavito.

## License

* This project is under GNU General Public License - see [LICENSE](https://github.com/swilsonmelo/Lab1ArepMvnGit/blob/master/LICENSE) to more info.

