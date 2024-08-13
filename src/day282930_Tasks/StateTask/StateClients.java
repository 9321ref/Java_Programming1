package day282930_Tasks.StateTask;

public class StateClients {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("ABC","Glenn Youngkin","Mark Warner",800000000);

        California california = new California("DEF"," "  ,"John",9000000);

        Florida florida = new Florida("GHK","Jimmy","Daniel",291093833);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(florida);

        System.out.println(virginia.getAbbreviation());
        florida.setSenator("Marco Rubio");

        //virginia.setAbbreviation(" ");
    }
}
