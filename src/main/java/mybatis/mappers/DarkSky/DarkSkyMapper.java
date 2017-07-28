package mybatis.mappers.DarkSky;

import mybatis.model.DarkSky.Forecast;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by daniel on 27.07.17.
 */
@Mapper
public interface DarkSkyMapper {

    String ADD_NEW = "INSERT INTO `forecast`.Forecasts (date, summary, sunrise, sunset, precipProbability, temperatureMax, windSpeed) " +
            "values (#{date}, #{summary} , #{sunrise}, #{sunset}, #{precipProbability}, #{temperatureMax}, #{windSpeed})";

    @Insert(ADD_NEW)
    public void addNew(Forecast f);

}
