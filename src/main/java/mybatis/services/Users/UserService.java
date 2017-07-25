package mybatis.services.Users;

import mybatis.mappers.Users.UserMapper;
import mybatis.model.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by daniel on 24.07.17.
 */
@Service
public class UserService {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Autowired
    UserMapper userMapper;

    public ArrayList<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public ArrayList<User> getAllUsersManually() {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Creating connection");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mybatis-test?" +
                    "user=root&password=password&useSSL=false");

            System.out.println("connected.");
            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            preparedStatement = connection
                    .prepareStatement("SELECT * FROM Users");

            resultSet = preparedStatement.executeQuery();
            ArrayList<User> result2 = writeResultSet(resultSet);

            return result2;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<User> writeResultSet(ResultSet resultSet) throws SQLException {

        ArrayList<User> result = new ArrayList<>();

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            int isActive = resultSet.getInt("isActive");


            User u = new User();
            u.setId(id);
            u.setFirst_name(first_name);
            u.setLast_name(last_name);
            u.setIsActive(isActive);
            result.add(u);
        }
        return result;
    }

    public User getById(int id){
        return userMapper.getById(id);
    }

    public User deleteById(int id) {

        int x=userMapper.deleteUser(id);
        return userMapper.getById(id);
    }


    public User updateById(User user) {
        int x=userMapper.updateUser(user);
        return userMapper.getByName(user.getFirst_name());
    }

    public User addNew(User user) {
        int x=userMapper.addNew(user);
        return userMapper.getByName(user.getFirst_name());
    }
}
