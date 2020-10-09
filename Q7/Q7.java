package Q7;

class Date{
    int day,month,year;
    Date(){
            day = 01;
            month = 01;
            year = 1970;
    }
    Date(int d){
            day = d;
            month = 01;
            year = 1970;
    }
    Date(int d, int m){
            day = d;
            month = m;
            year = 1970;
    }
    Date(int d, int m, int y){
            day = d;
            month = m;
            year = y;
    }
    int getPrevDay(){
            if(day==1){
                    if(month ==1 || month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11)
                        return 31;
                    else if(month == 3){
                    	if(year%4==0)
                            return 29;
                        else
                            return 28;
                    }
                    else
                        return 30;
            }
            else
                return day-1;
    }
    int getNextDay(){
        if(month == 1 || month == 3 || month==5 || month == 8 || month == 10 || month == 12){
            if(day == 31)
                return 1;
            else
                return day+1;
        }
        else if(month ==2 ){
            if(day==28 && year%4==0)
                return 29;
            else if(day==29)
                return 1;
            else if(day == 28 && year%4!=0)
                return 1;
            else
                return day+1;
        }
        else{
            if(day == 30)
                return 1;
            else
                return day+1;
        }
    }
    void disp(){
            System.out.println("DAY: " + day);
    }
    
}



public class Q7 {
	public static void main(String args[]){
	    Date d1 = new Date(13,01,2020);
	    Date d2 = new Date(28,02,2020);
	    Date d3 = new Date(29,02,2020);
	    System.out.println("DAY: "+d1.getPrevDay());
	    System.out.println("DAY: "+d1.getNextDay());
	    d1.disp();
	    System.out.println("DAY: "+d2.getPrevDay());
	    System.out.println("DAY: "+d2.getNextDay());
	    d2.disp();
	    System.out.println("DAY: "+d3.getPrevDay());
	    System.out.println("DAY: "+d3.getNextDay());
	    d3.disp();
	}
}
