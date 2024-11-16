package EncapsulationPractice;

public class TeamDetails {
    private int totalTeamMembers;
    private String captainName;
    private String sportName;

    public TeamDetails(int totalTeamMembers, String captainName, String sportName) {
        this.totalTeamMembers = totalTeamMembers;
        this.captainName = captainName;
        this.sportName = sportName;
    }

    public int getTotalTeamMembers() {
        return totalTeamMembers;
    }

    public void setTotalTeamMembers(int totalTeamMembers) {
        if(totalTeamMembers > 2) {
            this.totalTeamMembers = totalTeamMembers;
        } else {
            System.out.println("Invalid value: The total number of team members is greater than 2");
        }
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String name) {
        if(name != "Cricket" && name != "Badminton" && name != "Carrom") {
            System.out.println("Invalid value: The sport name is wrong");
        } else {
            this.sportName = name;
        }
    }
}
