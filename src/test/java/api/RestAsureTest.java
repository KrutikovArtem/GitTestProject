package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestAsureTest {

    final String BASE_USER = "https://reqres.in/";


    @Test
    public void getSingleUser(){

        String expectedAvatar = "https://reqres.in/img/faces/2-image.jpg";
        String expectedurl = "https://reqres.in/#support-heading";

        Response response1 = given() //дано
                .when()//когла
                .contentType(ContentType.JSON) //какой тип данных мы передаем (json)
                .get(BASE_USER+"api/users/2")//метод и юрл по кторому передаем дальше
                .then().log().all() //тогда.выведи логи в консоль.все
                .statusCode(200)// проверь что статус код равен 200
                .extract().response(); //и извлеки ответ в обьект класса response1

        //response1.jsonPath().get(); получить ответ ввиде json
        String actualAvatar = response1.jsonPath().get("data.avatar"); //обращаюсь к ответу и спускаюсь по дереву
        Assertions.assertEquals(expectedAvatar, actualAvatar);  //проверка на совподение
        String actualUrl= response1.jsonPath().get("support.url");
        Assertions.assertEquals(expectedurl,actualUrl);
    }

    @Test
    public void getSingleResource(){



        Response response2 = given()
                .when()
                .contentType(ContentType.JSON)
                .get(BASE_USER+"api/unknown/2")
                .then().log().all()
                .statusCode(200)
                .extract().response();



    }













}
