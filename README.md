# QuestionManager
A backend of QuestionManager for Insticator

This is a task of Insticator Interview. The requirement is in the file Insticator_backend_code_test_v3.txt

This task has not been finished yet, and I am still working on it.

Here is the basic information of this project.

Framwork: Java Spring boot
Database: MySQL

There are 6 layers in this task, which are controller, dao, data, service, transfer, view.

Data layer contains the object in the task, containing the four types of questions, user and the relation between the objects above. Each object represent a table in the database.

Service layer is used to do complex CRUD process for the table in database.

Dao layer helps service layer to do basic CRUD process, implementing JPA.

View layer contains the object which will be sent to frontend. 
In some cases, we should not send the whole information of the object in the data layer to the frontend.
for example, the answer of the trivia should not be sent to the frontend. So I create TriviaView in this layer.

Transfer layer is used to transfer the object between the object in Data layer and the object in View layer.

Controller layer is used to distribute the request from frontend to different services.
