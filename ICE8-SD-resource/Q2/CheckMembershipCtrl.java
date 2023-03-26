
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String studentName, String studentTeam) {
        Team team = teamDAO.retrieve(studentTeam);
        if (team == null) {
            return -1;
        }
        
        TMSDate dateFormed = team.getDateFormed();

        int teamSize = team.getTeamSize();
        Student teamMember = team.retrieve(studentName);
        if (teamMember == null) {
            return -1;
        }
        TMSDate joinedDate = teamMember.getDateJoined();
        int difference = joinedDate.calculateDifference(dateFormed);
        return difference;
    }
    
}
