class Solution {
public:
    int minMovesToSeat(vector<int>& seats, vector<int>& students) {
        int n = seats.size();
        int m = students.size();
        int c=0,s=0,t=0;
        sort(seats.begin(),seats.end());
        sort(students.begin(),students.end());
        for(int i=0;i<n;i++){
           c += abs(seats[i]-students[i]);
        }
        return c;
    }
};