package mybatis.model.Refugees;

/**
 * Created by daniel on 24.07.17.
 */
public class Refugee {
    int ID;
    int Year;
    String CountryOfResidense;
    String Origin;
    double Refugees;
    double PendingCases;
    double ReturnedRefugees;
    double IDPs;
    double ReturnedIDPs;
    double StatelessPersons;
    double OthersOfConcern;
    double TotalPopuation;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getCountryOfResidense() {
        return CountryOfResidense;
    }

    public void setCountryOfResidence(String countryOfResidense) {
        CountryOfResidense = countryOfResidense;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public double getRefugees() {
        return Refugees;
    }

    public void setRefugees(double refugees) {
        Refugees = refugees;
    }

    public double getPendingCases() {
        return PendingCases;
    }

    public void setPendingCases(double pendingCases) {
        PendingCases = pendingCases;
    }

    public double getReturnedRefugees() {
        return ReturnedRefugees;
    }

    public void setReturnedRefugees(double returnedRefugees) {
        ReturnedRefugees = returnedRefugees;
    }

    public double getIDPs() {
        return IDPs;
    }

    public void setIDPs(double IDPs) {
        this.IDPs = IDPs;
    }

    public double getReturnedIDPs() {
        return ReturnedIDPs;
    }

    public void setReturnedIDPs(double returnedIDPs) {
        ReturnedIDPs = returnedIDPs;
    }

    public double getStatelessPersons() {
        return StatelessPersons;
    }

    public void setStatelessPersons(double statelessPersons) {
        StatelessPersons = statelessPersons;
    }

    public double getOthersOfConcern() {
        return OthersOfConcern;
    }

    public void setOthersOfConcern(double othersOfConcern) {
        OthersOfConcern = othersOfConcern;
    }

    public double getTotalPopuation() {
        return TotalPopuation;
    }

    public void setTotalPopuation(double totalPopuation) {
        TotalPopuation = totalPopuation;
    }
}
