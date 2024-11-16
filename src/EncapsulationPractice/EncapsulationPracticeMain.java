package EncapsulationPractice;
import EncapsulationPractice.*;

public class EncapsulationPracticeMain {
    public static void main(String[] args) {

        EncapsulationPractice encapPractice = new EncapsulationPractice("My Encap Code", 2);

        //displaying initial values
        encapPractice.displayEncapsulationCode();
        encapPractice.displayEncapsulationDuration();

        //Modifying initial values using setter method
        encapPractice.setCode("My Encap Code using set method");
        encapPractice.setCodeDuration(4);
        encapPractice.displayEncapsulationCode();
        encapPractice.displayEncapsulationDuration();
        encapPractice.getCode();

        System.out.println("*********Encapsulation own method practice starts");

        TeamDetails team = new TeamDetails(8, "Mugi", "Badminton");
        System.out.println(team.getSportName());
        System.out.println(team.getTotalTeamMembers());
        team.setTotalTeamMembers(1);
        team.setSportName("Mugi");
        team.setTotalTeamMembers(4);
        team.setSportName("Cricket");
        System.out.println(team.getSportName());
        System.out.println(team.getTotalTeamMembers());


        System.out.println("*********Encapsulation own method practice ends");

    }
}
