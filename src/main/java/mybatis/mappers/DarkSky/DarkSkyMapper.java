package mybatis.mappers.DarkSky;

import mybatis.model.DarkSky.Forecast;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by daniel on 27.07.17.
 */
@Mapper
public interface DarkSkyMapper {

    String ADD_NEW = "INSERT INTO `forecast`.Forecasts (date, summary, sunrise, sunset, precipProbability, temperatureMax, windSpeed) " +
            "values (#{date}, #{summary} , #{sunrise}, #{sunset}, #{precipProbability}, #{temperatureMax}, #{windSpeed})";
    String GET_ALL_USERS = "SELECT * FROM `mybatis-test`.Users";

    @Insert(ADD_NEW)
    public void addNew(Forecast f);

    @Select(GET_ALL_USERS)
    public ArrayList<Forecast> getDatabase();


}
