
/**
 * Write a description of class TestPollDisplay here.
 *
 * Emma Belmont
 * October 3, 2018
 */
public class TestPollDisplay 
{
    public static void main(String[] args)
    {
        PollDisplayPanel votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println(votingMachine);
    }
}