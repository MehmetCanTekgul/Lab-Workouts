public class MyDate {
    int day, month, year;

    int[] maxDays ={31,29, 31 , 30 , 31, 30, 31, 31 ,30 ,31 ,30 , 31};

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return year + "-" +( month < 10 ? "0": "")+month+ "-" +( day < 10 ? "0": "")+ day;
    }
    public void incrementDay(){
        day++;

        if (day>maxDays[month-1]){
            day = 1;
            month++;

        }else if (month==2 && day == 29 && !inLeapYear()){

            day = 1;
            month++;
        }

    }
    public boolean inLeapYear(){
        return year%4==0;
    }

    public void incrementYear(int diff){
        year+=diff;
        if (month==2 && day ==29 && !inLeapYear()){
            day=28;
        }
    }

    public void decrementDay(){

        day--;
        if (day==0){
            month--;
            if(inLeapYear() && month==2){
                day=28;
            }
            else{
            day = maxDays[month-1];
            }
        }
    }
    public void decrementYear(){
        incrementYear(-1);
    }
    public void decrementMonth(){
        month--;
    }
    public void incrementDay(int diff){
        while(diff >0){
            incrementDay();
            diff--;
        }
    }
    public void decrementMonth(int diff){

        incrementMonth(-diff);
    }
    public void incrementMonth(int diff){
        month+=diff;
        int yearDiff = (month-1) / 12 ;
        year+=yearDiff;

        int newMonth= ((month-1) % 12) +1;
        month = newMonth < 0 ? newMonth + 12 : newMonth;

        if (newMonth<0)
            yearDiff--;
        year+=yearDiff;

        if (day>maxDays[month-1]){
            day = maxDays[month-1];

        }else if (month==2 && day == 29 && !inLeapYear()){

            day = 28;
        }
    }

    public void decrementDay(int diff){
        while(diff>0){
            decrementDay();
            diff--;
        }
    }
    public void decrementYear(int diff){
        incrementYear(-diff);
    }
    public void incrementMonth(){
        incrementMonth(1);
    }
    public void incrementYear(){
        incrementYear(1);
    }


    public boolean isBefore(MyDate anotherDate) {
        return false;
    }

    public boolean isAfter(MyDate anotherDate) {
        return false;
    }

    public int dayDifference(MyDate anotherDate) {
    return 1;
    }
}
