public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        InterestGroup interestGrp = IGDM.retrieve(IGName);
        
        if (interestGrp!= null) {
            Student president = interestGrp.retrievePresidentInYear(year);
            return president;
        }
        return null;
    }
}
