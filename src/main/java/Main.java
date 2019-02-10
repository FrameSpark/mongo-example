import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        MongoService service = new MongoService();
        UserRepo users = new UserRepo(service.table);


        User sanek = new User();
        sanek.setId("1");
        sanek.setName("Sanek");

        users.addToDB(sanek);

        users.get("1");



    }


}
