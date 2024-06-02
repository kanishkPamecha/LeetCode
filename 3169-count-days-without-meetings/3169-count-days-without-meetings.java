class Solution {
    public int countDays(int days, int[][] meetings) {
     Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
int end = meetings[0][1], noMeetingDays = meetings[0][0] - 1;
for (int i = 1; i < meetings.length; i++) {
  if (end < meetings[i][0])
    noMeetingDays += meetings[i][0] - end -1;
  end = Math.max(end, meetings[i][1]);
}
return noMeetingDays + days - end;
    }
}