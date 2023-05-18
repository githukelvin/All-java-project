import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tournament {
    private String name;
    private List<Participant> participants;
    private List<Round> rounds;

    public Tournament(String name) {
        this.name = name;
        this.participants = new ArrayList<>();
        this.rounds = new ArrayList<>();
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void startTournament() {
        // Shuffle the list of participants
        Collections.shuffle(participants);

        // Create pairings for the first round
        List<Pairing> pairings = new ArrayList<>();
        for (int i = 0; i < participants.size() - 1; i += 2) {
            Participant p1 = participants.get(i);
            Participant p2 = participants.get(i + 1);
            pairings.add(new Pairing(p1, p2));
        }

        // Create the first round
        Round firstRound = new Round(1, pairings);
        rounds.add(firstRound);

        // Play the remaining rounds until we have a winner
        int roundNumber = 2;
        while (pairings.size() > 1) {
            List<Pairing> nextPairings = new ArrayList<>();
            for (int i = 0; i < pairings.size() - 1; i += 2) {
                Pairing p1 = pairings.get(i);
                Pairing p2 = pairings.get(i + 1);
                Participant winner = playMatch(p1, p2);
                nextPairings.add(new Pairing(winner, null));
            }
            if (pairings.size() % 2 == 1) {
                // If there is an odd number of pairings, add the last one to the next round
                nextPairings.add(pairings.get(pairings.size() - 1));
            }
            Round nextRound = new Round(roundNumber, nextPairings);
            rounds.add(nextRound);
            pairings = nextPairings;
            roundNumber++;
        }

        // Print the winner of the tournament
        System.out.println("Winner: " + pairings.get(0).getWinner().getName());
    }

    private Participant playMatch(Pairing p1, Pairing p2) {
        // Simulate a match between the two pairings
        Random rand = new Random();
        int p1Score = rand.nextInt(11);
        int p2Score = rand.nextInt(11);
        if (p1Score > p2Score) {
            return p1.getWinner();
        } else {
            return p2.getWinner();
        }
    }

    public void printResults() {
        // Print the results of each round
        for (Round round : rounds) {
            System.out.println("Round " + round.getNumber());
            for (Pairing pairing : round.getPairings()) {
                System.out.println(pairing.getPlayer1().getName() + " vs. " + pairing.getPlayer2().getName() + ": " + pairing.getWinner().getName());
            }
        }
    }
}