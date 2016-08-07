package controllers;

import play.mvc.*;
import models.Person;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import java.sql.SQLException;

public class RespController extends Controller {

    public Result html() {
        Result htmlResult = ok("<h1>Hello World!</h1>").as("text/html");
        return htmlResult;
    }

    public Result json(String name, String pwd) throws SQLException {
        Person person = new Person();
        person.setName(name);
        person.setPwd(pwd);
        person.setId(4445444);
        person.save();
        JsonNode json = Json.toJson(person);
        Result jsonResult = ok(json);
        return jsonResult;
    }

}