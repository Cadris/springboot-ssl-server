# springboot-ssl-server

## Wish List

| Features Want to Add  | Status |
| ----------- | ----------- |
| A api end pont  | Done   |
|The end pont must take data from properties file| Done |
|A jsp webpage at home| Done |
|SSL to it||
|Serve it through nginx||
|Add H2 in memory database to application||
|Make a CRUD Application as webapp||
|Make the Webapp use able from command line||
|Make the Webapp operatable with api||

### Links Added till now

|Request Type| Link in application  | Use |
|-----| ----------- | ----------- |
| [GET] | /api | All the api will come under this catagory |
| [GET] | /api/ | This will display a Welcome a Welcome Message |
| [GET] | /api/welcome | This will display a Welcome a Welcome Message |

-----------------

Personal Notes:
1. to use jpa add: 
	* Add `spring.mvc.view.prefix` and `spring.mvc.view.prefix` in `application.properties`. 
 	* Add `webapp` folder under `src/main/<as given in prefix>`
	* Add `tomcat-jasper` to pom.
	* Add `jstl` dependency too as it will be required after.
