/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        int prevEnd = -1;

        for(int i = 0; i < intervals.size(); i++) {
            if(prevEnd > intervals.get(i).start) 
                return false;
            
            prevEnd = intervals.get(i).end;
        }

        return true;
    }
}
