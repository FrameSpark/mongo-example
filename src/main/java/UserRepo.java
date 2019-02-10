import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class UserRepo {

    DBCollection table;



    public UserRepo(DBCollection table) {
        this.table = table;
    }


    public void addToDB(User user) {
        BasicDBObject object = new BasicDBObject();
        object.put("id", user.getId());
        object.put("name", user.getName());
        table.insert(object);
    }

    public void get(String id){
        DBObject user = new BasicDBObject("id",id);
        DBCursor cursor = table.find(user);
        System.out.println(cursor.one().get("name"));

    }
}
