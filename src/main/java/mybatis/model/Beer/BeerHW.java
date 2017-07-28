package mybatis.model.Beer;

/**
 * Created by daniel on 25.07.17.
 */
public class BeerHW {
    String name;

    String brewery;
    String city;
    String state;



    public BeerHW(Beer beer){
        name=beer.getData().getName();
        String[] breweryArr;
        breweryArr=beer.getData().breweries[0].toString().split(",");
        brewery=breweryArr[1].replaceAll(" name=","");
        String[] temp=beer.getData().breweries[0].toString().split("locality=");
        String[] temp2=temp[1].split(",");
        city=temp2[0];
        state=temp2[1].replaceAll(" region=", "");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
