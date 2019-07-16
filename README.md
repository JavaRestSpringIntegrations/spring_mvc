# Spring MVC

This repo contains the initial info of creating Spring MVC project.

The below diagram shows the flow of Spring MVC request processing.

![MVC Request flow](images/mvc_request_flow.png)

Steps:

1. The browser creates a request for a specific url. `Dispatcher Servlet` acts as front controller to receive all requests
2. The `Dispatcher Servlet` needs to identify which controller to handle the requests. So it uses `handler mapping`
3. `handler mapping` returns the specific handler method that handles the request
4. `Dispatcher Servlet` calls the specific handler method
5. The handler method returns the model and view name
6. The `Dispatcher Servlet` now has the logical view name
7. After the `View Resolver` receives the view name, it needs to find the **jsp** file in the WEB-INF/view directory
8. The file name is returned to `Dispatcher Servlet` and `Dispatcher Servlet` executes it 
9. The view is rendered and content is given to `Dispatcher Servlet`
10. The `Dispatcher Servlet` gives the response back to browser

## More about Spring MVC

The Model-View-Controller (MVC) is an architectural pattern that separates an application into three main logical 
components:
* Model - component corresponds to all the data-related logic that the user works with. This can represent either the data that is being transferred between the View and Controller components or any other 
business logic-related data.
* the view - component is used for all the UI logic of the application.
* the controller - act as an interface between Model and View components to process all the business logic and incoming requests. For example, 
the Customer controller will handle all the interactions and inputs from the Customer View and update the database 
using the Customer Model. The same controller will be used to view the Customer data.

![MVC Process](images/mvc-process.svg)

Image Courtesy : [wiki] [1]
## Request Parameter

Code file - `Demo Controller`; Line 41

When using request parameter the URL will change. The URL will
look like below:

`http://localhost:8080/todo-list/welcome?user=Sunil`

The data type used here is String, we can use other data types
as well.

### JSTL Tags

[1]: https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller

