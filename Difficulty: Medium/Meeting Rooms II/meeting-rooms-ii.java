class Solution {
    public int minMeetingRooms(int[] start, int[] end) {

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;

        int rooms = 0;
        int maxRooms = 0;

        while (i < start.length) {

            // New meeting starts before the earliest meeting ends
            if (start[i] < end[j]) {
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
                i++;
            }
            // Earliest meeting has ended, so free a room
            else {
                rooms--;
                j++;
            }
        }

        return maxRooms;
    }
}