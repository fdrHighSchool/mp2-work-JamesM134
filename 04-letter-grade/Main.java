class Main {
  public static void main(String[] args) {
  }

  public static String letterGrade(double grade) {
    String a = "A";
    String b = "B";
    String c = "C";
    String d = "D";
    String f = "F";

    if (grade >= 90) {
      return a;
    } else if (grade >= 80 && grade < 90) {
      return b;
    } else if (grade >= 70 && grade < 80) {
      return c;
    } else if (grade >= 60 && grade < 70) {
      return d;
    } else {
      return f;
    }

  }

}
