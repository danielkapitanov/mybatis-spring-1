package mybatis.rest_controllers.Beer;

import mybatis.model.Beer.Beer;
import mybatis.model.Beer.BeerHW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by daniel on 25.07.17.
 */
@RestController
public class BeerController {

    String id="";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/beer/random")
    public Beer getRandomBeer() {
        Beer beer = restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/random?&key=bb5bbddb071c604ccae09a337412a01b", Beer.class);
        id=beer.getData().getId();
        return beer;
    }

    @RequestMapping("/beer/homework")
    public BeerHW getRandomBeerBrew() {
        Beer beer = restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/"+id+"?withBreweries=Y&key=bb5bbddb071c604ccae09a337412a01b", Beer.class);

        BeerHW beerHW = new BeerHW(beer);

        return beerHW;
    }

}
