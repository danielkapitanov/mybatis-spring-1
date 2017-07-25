package mybatis.mappers.Users;

import mybatis.model.Users.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * Created by daniel on 24.07.17.
 */
@Mapper
public interface UserMapper {

    String GET_ALL_USERS = "SELECT * FROM `mybatis-test`.Users";
    String GET_BY_ID = "SELECT * FROM `mybatis-test`.Users where id = #{id}";
    String ADD_NEW = "INSERT INTO `mybatis-test`.Users (first_name, last_name, isActive) values (#{first_name}, #{last_name} , #{isActive})";
    String UPDATE_USER = "UPDATE `mybatis-test`.Users set first_name=#{first_name}, last_name=#{last_name}, isActive=#{isActive} where id=#{id}";
    String DELETE_USER = "UPDATE `mybatis-test`.Users set isActive=0 where id=#{id}";
    String GET_BY_NAME = "SELECT * FROM `mybatis-test`.Users where first_name = #{first_name}";

    @Insert(ADD_NEW)
    public int addNew(User user);

    @Select(GET_ALL_USERS)
    public ArrayList<User> getAllUsers();

    @Select(GET_BY_ID)
    public User getById(int id);

    @Update(UPDATE_USER)
    public int updateUser(User user);

    @Delete(DELETE_USER)
    public int deleteUser(int id);

    @Select (GET_BY_NAME)
    public User getByName(String name);

}
