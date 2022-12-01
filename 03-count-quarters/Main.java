class Main {
  public static void main(String[] args) {
    System.out.println(countQuarters(1278));
    System.out.println(countQuarters(50));
    System.out.println(countQuarters(5000));
    System.out.println(countQuarters(125));
    System.out.println(countQuarters(2279));
    System.out.println(countQuarters(34));
    System.out.println(countQuarters(0));
  }
  public static int countQuarters(int cents){

    Sting cent = Integer.toString.toString(cents);

  if(cent.lenght() < 2){
    return 0;
    }

    String remain = cent.substring(cent.lenght() - 2);

    int remaining = Integer.valueOf(remain);

    int numberOfQuarters= remaining/25;
    return numberOfQuarters;
  }
}
