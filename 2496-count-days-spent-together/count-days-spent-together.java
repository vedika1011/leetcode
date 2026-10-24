import java.time.LocalDate;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceStart=toDay(arriveAlice);
        int aliceLeave=toDay(leaveAlice);
        int bobStart=toDay(arriveBob);
        int bobLeave=toDay(leaveBob);
        int start=Math.max(aliceStart,bobStart);
        int end=Math.min(aliceLeave,bobLeave);
        return Math.max(0,end-start+1);
    }
    public int toDay(String date){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        return LocalDate.of(2025,month,day).getDayOfYear();
    }
}