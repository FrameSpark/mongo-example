import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        //Create connection
        //MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        //or
        MongoClient mongoClient = new MongoClient(); //Создаем соединение с базой. Такой способ для локалки автомитически. Сверху для подключения к хосту и порту.
    }
}
