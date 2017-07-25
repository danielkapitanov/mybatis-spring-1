package mybatis.mappers.Refugees;

import mybatis.model.Refugees.Refugee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by daniel on 24.07.17.
 */
@Mapper
public interface RefugeesMapper {
    String GET_ALL_DATA = "SELECT * FROM `immigrants`.refugees_all";
    String GET_BULGARIA_DATA = "SELECT * FROM `immigrants`.refugees_all WHERE CountryOfResidense='Bulgaria'";
    String GET_BY_YEAR = "SELECT * FROM `immigrants`.refugees_all WHERE Year=#{Year}";
    String GET_BY_COR = "SELECT * FROM `immigrants`.refugees_all WHERE CountryOfResidense='#{CoR}'";

    @Select(GET_ALL_DATA)
    public ArrayList<Refugee> getAllData();

    @Select(GET_BULGARIA_DATA)
    public ArrayList<Refugee> getAllBGData();

    @Select(GET_BY_YEAR)
    public ArrayList<Refugee> getByYear(int Year);

    @Select(GET_BY_COR)
    public ArrayList<Refugee> getByCoR(String CountryOfResidense);
}
