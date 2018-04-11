package asquero.com.myapplication;

/**
 * Created by mansi on 12/4/18.
 */

class EndedList {
    private String contestCode;
    private String contestName;
    private String startDate;
    private String endDate;
    //private int image;
    private String AIC;

    public EndedList(String contestCode, String contestName, String startDate, String endDate, String AIC) {
        this.contestCode = contestCode;
        this.contestName = contestName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.AIC = AIC;
    }

    public String getContestCode() {
        return contestCode;
    }

    public String getContestName() {
        return contestName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getAIC() {
        return AIC;
    }
}
