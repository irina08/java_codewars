/* Return the name of the winner. If there is no winner, return null
(in Java and JavaScript), None (in Python) or nil (in Ruby).
Task Description
There are no given candidates. An elector can vote for anyone.
Each ballot contains only one name and represents one vote for
this name. A name is an arbitrary string, e.g. "A", "B", or "XJDHD".
There are no spoiled ballots.
The ballot-box is represented by an unsorted list of names.
Each entry in the list corresponds to one vote for this name.
You do not know the names in advance (because there are no candidates).

A name wins the election if it gets more than n/2 votes (n = number of
all votes, i.e. n is equal to the size of the given list).
Examples
//3 votes for "A", 2 votes for "B" -> "A" wins the election
BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B")).equals("A") //true
//2 votes for "A", 2 votes for "B" -> No winner
BallotsCounter.getWinner(Arrays.asList("A", "A", "B", "B")) == null //true
//1 vote for each name -> No winner
BallotsCounter.getWinner(Arrays.asList("A", "B", "C", "D")) == null //true
//3 votes for "A", 2 votes for "B", 1 vote for "C"
//-> No winner ("A" does not have more than n/2 = 3 votes)
BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "C")) == null //true
Note
Please keep in mind the list of votes can be large (n <= 1,200,000).
The given list is immutable, i.e. you cannot modify the list
(otherwise this could lead to vote rigging).
 */

package kyu6;

import java.util.*;

public class WhoWonTheElection {
    public static String getWinner(final List<String> listOfBallots) {
        if (listOfBallots.size() == 1) return listOfBallots.get(0);

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : listOfBallots) {
            if (map.containsKey(s)) {
                int count = map.get(s) + 1;
                if (count > (listOfBallots.size() / 2)) {
                    return s;
                }
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }
        return null;
    }
}