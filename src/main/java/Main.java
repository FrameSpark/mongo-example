import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        //Create connection
        //MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        //or
        MongoClient mongoClient = new MongoClient(); //Создаем соединение с базой. Такой способ для локалки автомитически. Сверху для подключения к хосту и порту.

        DB database = mongoClient.getDB("MyData"); //Берем базу по названию
        DBCollection table = database.getCollection("Users"); //Берем таблицу по названию
}

public void addToDB(User user, DBCollection table) {
    BasicDBObject object = new BasicDBObject();
    object.put("id", user.getId());
    object.put("name", user.getName());
    table.insert(object);
}
