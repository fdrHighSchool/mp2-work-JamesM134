class Main {
  public static void main(String[] args) {
    isLeapYear(2022);//false
    isLeapYear(2024);//true
    isLeapYear(1900);//false
    isLeapYear(2000);//true
    }
  public static void isLeapYear(int year){
    if ((year % 4 == 0) && ((year% 100 != 0) || (year %400 == 0))){
      System.out.println("this is leap year");
      }
    else{
      System.out.println("this is not leap year");
    }
  }
}
