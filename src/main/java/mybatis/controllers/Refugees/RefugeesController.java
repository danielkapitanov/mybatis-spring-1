package mybatis.controllers.Refugees;

import mybatis.model.Refugees.Refugee;
import mybatis.services.Refugees.RefugeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by daniel on 24.07.17.
 */
@RestController
@RequestMapping("/refugees")
public class RefugeesController {


    @Autowired
    RefugeesService refugeesService;

    @RequestMapping("/")
    public ArrayList<Refugee> getAllData() {
        return refugeesService.getAllData();
    }

    @RequestMapping("/Bulgaria")
    public ArrayList<Refugee> getAllBGData() {
        return refugeesService.getAllBGData();
    }

    @RequestMapping("/Country/{CountryOfResidense}")
    public ArrayList<Refugee> getByCoR(@PathVariable(value = "CountryOfResidense") String CountryOfResidense) {
        return refugeesService.getByCoR(CountryOfResidense);
    }

    @RequestMapping("/{Year}")
    public ArrayList<Refugee> getByYear(@PathVariable(value = "Year") int Year) {
        return refugeesService.getByYear(Year);
    }


}
