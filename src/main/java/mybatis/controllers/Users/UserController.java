package mybatis.controllers.Users;

import mybatis.model.Users.User;
import mybatis.services.Users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public ArrayList<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/manual")
    public ArrayList<User> getUsersManually() {
        return userService.getAllUsersManually();
    }

    @RequestMapping("/{id}")
    public User getById(@PathVariable(value = "id") int id) {
        return userService.getById(id);
    }

    //Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public User addNew(@RequestBody User user) {
        return userService.addNew(user);
    }

    //Update
    @RequestMapping(method = RequestMethod.PATCH, value = "/")
    public User updateById(@RequestBody User user) {
        return userService.updateById(user);
    }

    //Delete
    @RequestMapping(method= RequestMethod.DELETE, value = "/")
    public User deleteById(@PathVariable(value="id")int id){
        return userService.deleteById(id);
    }


}


