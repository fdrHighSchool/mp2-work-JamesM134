class Main {
  public static void main(String[] args) {  
    divby3(212123);//true
    }

  public static void divby3(int div){
    int sum = 0

    while (div != 0){
      sum += div % 10
      div = div /10  
    }  

    if(sum % 3 ==0){
      system.out.println("this number is divisible by 3 ");
      else{
      system.out.println("this number is not divisible by 3 ");
      }
    }
  }
}
