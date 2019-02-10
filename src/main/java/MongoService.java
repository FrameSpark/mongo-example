import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class MongoService {
    MongoClient mongoClient;
    DB database;
    DBCollection table ;
    public void MongoService() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(); //Создаем соединение с базой. Такой способ для локалки автомитически. Сверху для подключения к хосту и порту.
        DB database = mongoClient.getDB("MyData"); //Берем базу по названию
        DBCollection table = database.getCollection("Users"); //Берем таблицу по названию
    }
}
